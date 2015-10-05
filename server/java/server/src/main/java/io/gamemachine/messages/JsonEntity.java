
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
public final class JsonEntity implements Externalizable, Message<JsonEntity>, Schema<JsonEntity>{



    public static Schema<JsonEntity> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static JsonEntity getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final JsonEntity DEFAULT_INSTANCE = new JsonEntity();
    static final String defaultScope = JsonEntity.class.getSimpleName();

    	
							    public String json= null;
		    			    
		
    
        	
							    public String klass= null;
		    			    
		
    
        


    public JsonEntity()
    {
        
    }


	


	public static void clearModel(Model model) {
    	    	    	    	    	    	model.set("json_entity_json",null);
    	    	    	    	    	    	model.set("json_entity_klass",null);
    	    }
    
	public void toModel(Model model) {
    	    	    	    	
    	    	    	//if (json != null) {
    	       	    	model.setString("json_entity_json",json);
    	        		
    	//}
    	    	    	    	    	
    	    	    	//if (klass != null) {
    	       	    	model.setString("json_entity_klass",klass);
    	        		
    	//}
    	    	    }
    
	public static JsonEntity fromModel(Model model) {
		boolean hasFields = false;
    	JsonEntity message = new JsonEntity();
    	    	    	    	    	
    	    	    	String jsonTestField = model.getString("json_entity_json");
    	if (jsonTestField != null) {
    		String jsonField = jsonTestField;
    		message.setJson(jsonField);
    		hasFields = true;
    	}
    	
    	    	
    	    	    	    	    	    	
    	    	    	String klassTestField = model.getString("json_entity_klass");
    	if (klassTestField != null) {
    		String klassField = klassTestField;
    		message.setKlass(klassField);
    		hasFields = true;
    	}
    	
    	    	
    	    	    	if (hasFields) {
    		return message;
    	} else {
    		return null;
    	}
    }


	            
		public String getJson() {
		return json;
	}
	
	public JsonEntity setJson(String json) {
		this.json = json;
		return this;	}
	
		            
		public String getKlass() {
		return klass;
	}
	
	public JsonEntity setKlass(String klass) {
		this.klass = klass;
		return this;	}
	
	
  
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

    public Schema<JsonEntity> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public JsonEntity newMessage()
    {
        return new JsonEntity();
    }

    public Class<JsonEntity> typeClass()
    {
        return JsonEntity.class;
    }

    public String messageName()
    {
        return JsonEntity.class.getSimpleName();
    }

    public String messageFullName()
    {
        return JsonEntity.class.getName();
    }

    public boolean isInitialized(JsonEntity message)
    {
        return true;
    }

    public void mergeFrom(Input input, JsonEntity message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                            	case 1:
            	                	                	message.json = input.readString();
                	break;
                	                	
                            	            	case 2:
            	                	                	message.klass = input.readString();
                	break;
                	                	
                            	            
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, JsonEntity message) throws IOException
    {
    	    	
    	    	//if(message.json == null)
        //    throw new UninitializedMessageException(message);
    	    	
    	    	    	if( (String)message.json != null) {
            output.writeString(1, message.json, false);
        }
    	    	
    	            	
    	    	
    	    	    	if( (String)message.klass != null) {
            output.writeString(2, message.klass, false);
        }
    	    	
    	            	
    }

	public void dumpObject()
    {
    	System.out.println("START JsonEntity");
    	    	//if(this.json != null) {
    		System.out.println("json="+this.json);
    	//}
    	    	//if(this.klass != null) {
    		System.out.println("klass="+this.klass);
    	//}
    	    	System.out.println("END JsonEntity");
    }
    
    public String getFieldName(int number)
    {
        switch(number)
        {
        	        	case 1: return "json";
        	        	case 2: return "klass";
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
    	    	__fieldMap.put("json", 1);
    	    	__fieldMap.put("klass", 2);
    	    }
   
   public static List<String> getFields() {
	ArrayList<String> fieldNames = new ArrayList<String>();
	String fieldName = null;
	Integer i = 1;
	
    while(true) { 
		fieldName = JsonEntity.getSchema().getFieldName(i);
		if (fieldName == null) {
			break;
		}
		fieldNames.add(fieldName);
		i++;
	}
	return fieldNames;
}

public static JsonEntity parseFrom(byte[] bytes) {
	JsonEntity message = new JsonEntity();
	ProtobufIOUtil.mergeFrom(bytes, message, JsonEntity.getSchema());
	return message;
}

public static JsonEntity parseFromJson(String json) throws IOException {
	byte[] bytes = json.getBytes(Charset.forName("UTF-8"));
	JsonEntity message = new JsonEntity();
	JsonIOUtil.mergeFrom(bytes, message, JsonEntity.getSchema(), false);
	return message;
}

public JsonEntity clone() {
	byte[] bytes = this.toByteArray();
	JsonEntity jsonEntity = JsonEntity.parseFrom(bytes);
	return jsonEntity;
}
	
public byte[] toByteArray() {
	return toProtobuf();
	//return toJson();
}

public String toJson() {
	boolean numeric = false;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	try {
		JsonIOUtil.writeTo(out, this, JsonEntity.getSchema(), numeric);
	} catch (IOException e) {
		e.printStackTrace();
		throw new RuntimeException("Json encoding failed");
	}
	String json = new String(out.toByteArray(), Charset.forName("UTF-8"));
	return json;
}

public byte[] toPrefixedByteArray() {
	LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
  Schema<JsonEntity> schema = JsonEntity.getSchema();
    
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
		bytes = ProtobufIOUtil.toByteArray(this, JsonEntity.getSchema(), buffer);
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
		ProtobufIOUtil.writeTo(buffer, this, JsonEntity.getSchema());
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException("Protobuf encoding failed "+e.getMessage());
	}
	return bb;
}

}