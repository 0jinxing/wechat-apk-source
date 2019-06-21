package org.xwalk.core.extension;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.Log;

public class MessageInfo
{
  private String TAG;
  private JSONArray mArgs;
  private ByteBuffer mBinaryArgs;
  private String mCallbackId;
  private String mCmd;
  private XWalkExternalExtension mExtension;
  private int mInstanceId;
  private String mJsName;
  private String mObjectId;

  public MessageInfo(MessageInfo paramMessageInfo)
  {
    this.TAG = "MessageInfo";
    this.mExtension = paramMessageInfo.mExtension;
    this.mInstanceId = paramMessageInfo.mInstanceId;
    this.mJsName = paramMessageInfo.mJsName;
    this.mCallbackId = paramMessageInfo.mCallbackId;
    this.mObjectId = paramMessageInfo.mObjectId;
    this.mArgs = paramMessageInfo.mArgs;
    this.mCmd = paramMessageInfo.mCmd;
  }

  public MessageInfo(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, String paramString)
  {
    AppMethodBeat.i(86132);
    this.TAG = "MessageInfo";
    this.mExtension = paramXWalkExternalExtension;
    this.mInstanceId = paramInt;
    if (paramString.trim().charAt(0) == '[');
    while (true)
    {
      try
      {
        paramXWalkExternalExtension = new org/json/JSONArray;
        paramXWalkExternalExtension.<init>(paramString);
        this.mArgs = paramXWalkExternalExtension;
        this.mCmd = "invokeNative";
        this.mJsName = this.mArgs.getString(0);
        this.mCallbackId = this.mArgs.getString(1);
        this.mObjectId = this.mArgs.getString(2);
        if (Build.VERSION.SDK_INT >= 19)
        {
          this.mArgs.remove(0);
          this.mArgs.remove(0);
          this.mArgs.remove(0);
        }
        AppMethodBeat.o(86132);
        return;
      }
      catch (JSONException paramXWalkExternalExtension)
      {
        Log.e(this.TAG, paramXWalkExternalExtension.toString());
        AppMethodBeat.o(86132);
        continue;
      }
      try
      {
        paramXWalkExternalExtension = new org/json/JSONObject;
        paramXWalkExternalExtension.<init>(paramString);
        paramString = paramXWalkExternalExtension.getString("cmd");
        paramInt = paramXWalkExternalExtension.getInt("objectId");
        this.mCmd = paramString;
        this.mObjectId = Integer.toString(paramInt);
        this.mCallbackId = Integer.toString(0);
        paramString = paramXWalkExternalExtension.getString("type");
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        this.mArgs = localJSONArray;
        if (!paramString.equals("postMessageToExtension"))
          break label315;
        this.mArgs = paramXWalkExternalExtension.getJSONArray("args");
        this.mJsName = paramXWalkExternalExtension.getString("name");
        if (!this.mCmd.equals("newInstance"))
          break label350;
        this.mObjectId = this.mArgs.getString(0);
        this.mArgs = this.mArgs.getJSONArray(1);
        AppMethodBeat.o(86132);
      }
      catch (JSONException paramXWalkExternalExtension)
      {
        Log.e(this.TAG, paramXWalkExternalExtension.toString());
        AppMethodBeat.o(86132);
      }
      continue;
      label315: this.mJsName = paramString;
      this.mArgs.put(0, paramXWalkExternalExtension.getString("name"));
      this.mArgs.put(1, paramXWalkExternalExtension.getJSONArray("args"));
      label350: AppMethodBeat.o(86132);
    }
  }

  public MessageInfo(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(86133);
    this.TAG = "MessageInfo";
    this.mExtension = paramXWalkExternalExtension;
    this.mInstanceId = paramInt;
    this.mCmd = "invokeNative";
    try
    {
      this.mArgs = null;
      paramXWalkExternalExtension = ByteBuffer.wrap(paramArrayOfByte);
      if (paramXWalkExternalExtension.order() != ByteOrder.LITTLE_ENDIAN)
        paramXWalkExternalExtension.order(ByteOrder.LITTLE_ENDIAN);
      int i = paramXWalkExternalExtension.position();
      paramInt = paramXWalkExternalExtension.getInt(i);
      int j = AlignedWith4Bytes(paramInt);
      i += 4;
      String str = new java/lang/String;
      str.<init>(paramArrayOfByte, i, paramInt);
      this.mJsName = str;
      paramInt = i + j;
      this.mCallbackId = Integer.toString(paramXWalkExternalExtension.getInt(paramInt));
      i = paramInt + 4;
      paramInt = paramXWalkExternalExtension.getInt(i);
      j = AlignedWith4Bytes(paramInt);
      i += 4;
      paramXWalkExternalExtension = new java/lang/String;
      paramXWalkExternalExtension.<init>(paramArrayOfByte, i, paramInt);
      this.mObjectId = paramXWalkExternalExtension;
      paramInt = i + j;
      this.mBinaryArgs = ByteBuffer.wrap(paramArrayOfByte, paramInt, paramArrayOfByte.length - paramInt);
      AppMethodBeat.o(86133);
      return;
    }
    catch (IndexOutOfBoundsException paramXWalkExternalExtension)
    {
      while (true)
      {
        Log.e(this.TAG, paramXWalkExternalExtension.toString());
        AppMethodBeat.o(86133);
      }
    }
    catch (NullPointerException paramXWalkExternalExtension)
    {
      while (true)
      {
        Log.e(this.TAG, paramXWalkExternalExtension.toString());
        AppMethodBeat.o(86133);
      }
    }
  }

  private int AlignedWith4Bytes(int paramInt)
  {
    return 4 - paramInt % 4 + paramInt;
  }

  public JSONArray getArgs()
  {
    return this.mArgs;
  }

  public ByteBuffer getBinaryArgs()
  {
    return this.mBinaryArgs;
  }

  public String getCallbackId()
  {
    return this.mCallbackId;
  }

  public String getCmd()
  {
    return this.mCmd;
  }

  public XWalkExternalExtension getExtension()
  {
    return this.mExtension;
  }

  public ExtensionInstanceHelper getInstanceHelper()
  {
    AppMethodBeat.i(86135);
    ExtensionInstanceHelper localExtensionInstanceHelper = this.mExtension.getInstanceHelper(this.mInstanceId);
    AppMethodBeat.o(86135);
    return localExtensionInstanceHelper;
  }

  public int getInstanceId()
  {
    return this.mInstanceId;
  }

  public String getJsName()
  {
    return this.mJsName;
  }

  public String getObjectId()
  {
    return this.mObjectId;
  }

  public void postResult(JSONArray paramJSONArray)
  {
    int i = 0;
    AppMethodBeat.i(86134);
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      localJSONArray.put(0, this.mCallbackId);
      while (i < paramJSONArray.length())
      {
        localJSONArray.put(i + 1, paramJSONArray.get(i));
        i++;
      }
      String str = this.TAG;
      paramJSONArray = new java/lang/StringBuilder;
      paramJSONArray.<init>("postResult: ");
      Log.w(str, localJSONArray.toString());
      this.mExtension.postMessage(this.mInstanceId, localJSONArray.toString());
      AppMethodBeat.o(86134);
      return;
    }
    catch (JSONException paramJSONArray)
    {
      while (true)
      {
        Log.e(this.TAG, paramJSONArray.toString());
        AppMethodBeat.o(86134);
      }
    }
  }

  public void postResult(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(86136);
    this.mExtension.postBinaryMessage(this.mInstanceId, paramArrayOfByte);
    AppMethodBeat.o(86136);
  }

  public void setArgs(JSONArray paramJSONArray)
  {
    this.mArgs = paramJSONArray;
  }

  public void setBinaryArgs(ByteBuffer paramByteBuffer)
  {
    this.mBinaryArgs = paramByteBuffer;
  }

  public void setCallbackId(String paramString)
  {
    this.mCallbackId = paramString;
  }

  public void setJsName(String paramString)
  {
    this.mJsName = paramString;
  }

  public void setObjectId(String paramString)
  {
    this.mObjectId = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.extension.MessageInfo
 * JD-Core Version:    0.6.2
 */