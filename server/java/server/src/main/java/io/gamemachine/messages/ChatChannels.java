
package io.gamemachine.messages;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;

import io.protostuff.ByteString;
import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.ProtobufOutput;

import java.io.ByteArrayOutputStream;
import io.protostuff.JsonIOUtil;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.runtime.RuntimeSchema;

import io.gamemachine.util.LocalLinkedBuffer;


import java.nio.charset.Charset;





import org.javalite.common.Convert;
import org.javalite.activejdbc.Model;
import io.protostuff.Schema;
import io.protostuff.UninitializedMessageException;



@SuppressWarnings("unused")
public final class ChatChannels implements Externalizable, Message<ChatChannels>, Schema<ChatChannels>{



    public static Schema<ChatChannels> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static ChatChannels getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ChatChannels DEFAULT_INSTANCE = new ChatChannels();
    static final String defaultScope = ChatChannels.class.getSimpleName();

        public List<ChatChannel> chatChannel;
	    


    public ChatChannels()
    {
        
    }


	


	public static void clearModel(Model model) {
    	    	    }
    
	public void toModel(Model model) {
    	    	    }
    
	public static ChatChannels fromModel(Model model) {
		boolean hasFields = false;
    	ChatChannels message = new ChatChannels();
    	    	    	if (hasFields) {
    		return message;
    	} else {
    		return null;
    	}
    }


	            
		public List<ChatChannel> getChatChannelList() {
		if(this.chatChannel == null)
            this.chatChannel = new ArrayList<ChatChannel>();
		return chatChannel;
	}

	public ChatChannels setChatChannelList(List<ChatChannel> chatChannel) {
		this.chatChannel = chatChannel;
		return this;
	}

	public ChatChannel getChatChannel(int index)  {
        return chatChannel == null ? null : chatChannel.get(index);
    }

    public int getChatChannelCount()  {
        return chatChannel == null ? 0 : chatChannel.size();
    }

    public ChatChannels addChatChannel(ChatChannel chatChannel)  {
        if(this.chatChannel == null)
            this.chatChannel = new ArrayList<ChatChannel>();
        this.chatChannel.add(chatChannel);
        return this;
    }
            	    	    	    	
    public ChatChannels removeChatChannelByName(ChatChannel chatChannel)  {
    	if(this.chatChannel == null)
           return this;
            
       	Iterator<ChatChannel> itr = this.chatChannel.iterator();
       	while (itr.hasNext()) {
    	ChatChannel obj = itr.next();
    	
    	    		if (chatChannel.name.equals(obj.name)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	    	
    public ChatChannels removeChatChannelByFlags(ChatChannel chatChannel)  {
    	if(this.chatChannel == null)
           return this;
            
       	Iterator<ChatChannel> itr = this.chatChannel.iterator();
       	while (itr.hasNext()) {
    	ChatChannel obj = itr.next();
    	
    	    		if (chatChannel.flags.equals(obj.flags)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
        	    	    	    	
    public ChatChannels removeChatChannelByInvite_id(ChatChannel chatChannel)  {
    	if(this.chatChannel == null)
           return this;
            
       	Iterator<ChatChannel> itr = this.chatChannel.iterator();
       	while (itr.hasNext()) {
    	ChatChannel obj = itr.next();
    	
    	    		if (chatChannel.invite_id.equals(obj.invite_id)) {
    	      			itr.remove();
    		}
		}
        return this;
    }
    
            	
    
    
    
	
  
    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<ChatChannels> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public ChatChannels newMessage()
    {
        return new ChatChannels();
    }

    public Class<ChatChannels> typeClass()
    {
        return ChatChannels.class;
    }

    public String messageName()
    {
        return ChatChannels.class.getSimpleName();
    }

    public String messageFullName()
    {
        return ChatChannels.class.getName();
    }

    public boolean isInitialized(ChatChannels message)
    {
        return true;
    }

    public void mergeFrom(Input input, ChatChannels message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                            	case 1:
            	            		if(message.chatChannel == null)
                        message.chatChannel = new ArrayList<ChatChannel>();
                                        message.chatChannel.add(input.mergeObject(null, ChatChannel.getSchema()));
                                        break;
                            	            
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, ChatChannels message) throws IOException
    {
    	    	
    	    	
    	    	if(message.chatChannel != null)
        {
            for(ChatChannel chatChannel : message.chatChannel)
            {
                if( (ChatChannel) chatChannel != null) {
                   	    				output.writeObject(1, chatChannel, ChatChannel.getSchema(), true);
    				    			}
            }
        }
    	            	
    }

	public void dumpObject()
    {
    	System.out.println("START ChatChannels");
    	    	//if(this.chatChannel != null) {
    		System.out.println("chatChannel="+this.chatChannel);
    	//}
    	    	System.out.println("END ChatChannels");
    }
    
    public String getFieldName(int number)
    {
        switch(number)
        {
        	        	case 1: return "chatChannel";
        	            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
    	    	__fieldMap.put("chatChannel", 1);
    	    }
   
   public static List<String> getFields() {
	ArrayList<String> fieldNames = new ArrayList<String>();
	String fieldName = null;
	Integer i = 1;
	
    while(true) { 
		fieldName = ChatChannels.getSchema().getFieldName(i);
		if (fieldName == null) {
			break;
		}
		fieldNames.add(fieldName);
		i++;
	}
	return fieldNames;
}

public static ChatChannels parseFrom(byte[] bytes) {
	ChatChannels message = new ChatChannels();
	ProtobufIOUtil.mergeFrom(bytes, message, ChatChannels.getSchema());
	return message;
}

public static ChatChannels parseFromJson(String json) throws IOException {
	byte[] bytes = json.getBytes(Charset.forName("UTF-8"));
	ChatChannels message = new ChatChannels();
	JsonIOUtil.mergeFrom(bytes, message, ChatChannels.getSchema(), false);
	return message;
}

public ChatChannels clone() {
	byte[] bytes = this.toByteArray();
	ChatChannels chatChannels = ChatChannels.parseFrom(bytes);
	return chatChannels;
}
	
public byte[] toByteArray() {
	return toProtobuf();
	//return toJson();
}

public String toJson() {
	boolean numeric = false;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	try {
		JsonIOUtil.writeTo(out, this, ChatChannels.getSchema(), numeric);
	} catch (IOException e) {
		e.printStackTrace();
		throw new RuntimeException("Json encoding failed");
	}
	String json = new String(out.toByteArray(), Charset.forName("UTF-8"));
	return json;
}

public byte[] toPrefixedByteArray() {
	LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
  Schema<ChatChannels> schema = ChatChannels.getSchema();
    
	final ByteArrayOutputStream out = new ByteArrayOutputStream();
    final ProtobufOutput output = new ProtobufOutput(buffer);
    try
    {
    	schema.writeTo(output, this);
        final int size = output.getSize();
        ProtobufOutput.writeRawVarInt32Bytes(out, size);
        final int msgSize = LinkedBuffer.writeTo(out, buffer);
        assert size == msgSize;
        
        buffer.clear();
        return out.toByteArray();
    }
    catch (IOException e)
    {
        throw new RuntimeException("Serializing to a byte array threw an IOException " + 
                "(should never happen).", e);
    }
 
}

public byte[] toProtobuf() {
	LinkedBuffer buffer = LocalLinkedBuffer.get();
	byte[] bytes = null;

	try {
		bytes = ProtobufIOUtil.toByteArray(this, ChatChannels.getSchema(), buffer);
		buffer.clear();
	} catch (Exception e) {
		buffer.clear();
		e.printStackTrace();
		throw new RuntimeException("Protobuf encoding failed "+e.getMessage());
	}
	return bytes;
}

public ByteBuf toByteBuf() {
	ByteBuf bb = Unpooled.buffer(512, 2048);
	LinkedBuffer buffer = LinkedBuffer.use(bb.array());

	try {
		ProtobufIOUtil.writeTo(buffer, this, ChatChannels.getSchema());
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException("Protobuf encoding failed "+e.getMessage());
	}
	return bb;
}

}