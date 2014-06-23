using UnityEngine;
using System;
using System.Collections;
using  System.Collections.Generic;
using System.Collections;
using GameMachine.World;
using GameMachine;

namespace GameMachine.World
{
    public class Launcher : MonoBehaviour
    {

        public static GameMachine.World.Player playerComponent;
        public static GameObject sounds;

        // Use this for initialization
        void Start()
        {
	
            sounds = GameObject.Find("Sounds");
            GameObject world = GameObject.Find("World");
            world.AddComponent("NpcManager");

            GameObject player = GameObject.Find("Player");
            playerComponent = player.GetComponent<GameMachine.World.Player>();
            playerComponent.SetNameTag(User.Instance.username);

            AreaOfInterest tracker = player.AddComponent(Type.GetType("GameMachine.World.AreaOfInterest")) as AreaOfInterest;

            StartChat();
        }
	
        void StartChat()
        {
            GameObject world = GameObject.Find("World");
            GameObject chatBox = new GameObject("ChatBox");
            chatBox.transform.parent = world.transform;
            chatBox.AddComponent("Chat");
        }

        void Update()
        {
	
        }
    }
}
