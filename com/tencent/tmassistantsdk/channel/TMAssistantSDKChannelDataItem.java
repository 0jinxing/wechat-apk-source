package com.tencent.tmassistantsdk.channel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.util.Base64;
import com.tencent.tmassistantsdk.util.Cryptor;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class TMAssistantSDKChannelDataItem
{
  public static final int DATEITEM_VERSION = 1;
  private static final String ENCRYPT_KEY = "&-*)Wb5_U,[^!9'+";
  public static final int IPCDATA_MIN_VERSION = 1;
  private static final String TAG = "MicroMsg.TMAssistantSDKChannelDataItem";
  public int mDBIdentity;
  public String mDataItemAction;
  public long mDataItemEndTime;
  public long mDataItemStartTime;
  public int mDataItemType;
  public int mDataItemVersion;
  public String mHostPackageName;
  public String mHostUserIdentity;
  public int mHostVersion;
  public byte[] mIPCData;

  public TMAssistantSDKChannelDataItem(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, long paramLong1, long paramLong2, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(75618);
    this.mDBIdentity = -1;
    this.mHostPackageName = "";
    this.mHostVersion = 0;
    this.mHostUserIdentity = "";
    this.mDataItemType = 0;
    this.mDataItemAction = "";
    this.mDataItemStartTime = 0L;
    this.mDataItemEndTime = 0L;
    this.mDataItemVersion = 0;
    this.mIPCData = null;
    this.mHostPackageName = paramString1;
    if (this.mHostPackageName == null)
      this.mHostPackageName = "";
    this.mHostVersion = paramInt1;
    this.mHostUserIdentity = paramString2;
    if (this.mHostUserIdentity == null)
      this.mHostUserIdentity = "";
    this.mDataItemType = paramInt2;
    this.mDataItemAction = paramString3;
    if (this.mDataItemAction == null)
      this.mDataItemAction = "";
    this.mDataItemStartTime = paramLong1;
    this.mDataItemEndTime = paramLong2;
    this.mDataItemVersion = paramInt3;
    this.mIPCData = paramArrayOfByte;
    AppMethodBeat.o(75618);
  }

  public static TMAssistantSDKChannelDataItem getDataItemFromByte(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(75619);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      AppMethodBeat.o(75619);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = new Cryptor().decrypt(paramArrayOfByte, "&-*)Wb5_U,[^!9'+".getBytes());
      if (paramArrayOfByte != null);
      try
      {
        Object localObject = new java/lang/String;
        ((String)localObject).<init>(paramArrayOfByte, "UTF-8");
        paramArrayOfByte = new org/json/JSONObject;
        paramArrayOfByte.<init>((String)localObject);
        String str1 = paramArrayOfByte.getString("mHostPackageName");
        int i = paramArrayOfByte.getInt("mHostVersion");
        String str2 = paramArrayOfByte.getString("mHostUserIdentity");
        int j = paramArrayOfByte.getInt("mDataItemType");
        String str3 = paramArrayOfByte.getString("mDataItemAction");
        long l1 = paramArrayOfByte.getLong("mDataItemStartTime");
        long l2 = paramArrayOfByte.getLong("mDataItemEndTime");
        int k = paramArrayOfByte.getInt("mDataItemVersion");
        if (k > 0)
        {
          paramArrayOfByte = paramArrayOfByte.getString("mIPCData");
          if (paramArrayOfByte != null)
          {
            paramArrayOfByte = Base64.decode(paramArrayOfByte, 0);
            localObject = new com/tencent/tmassistantsdk/channel/TMAssistantSDKChannelDataItem;
            ((TMAssistantSDKChannelDataItem)localObject).<init>(str1, i, str2, j, str3, l1, l2, k, paramArrayOfByte);
            AppMethodBeat.o(75619);
            paramArrayOfByte = (byte[])localObject;
          }
        }
      }
      catch (UnsupportedEncodingException paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.TMAssistantSDKChannelDataItem", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(75619);
        paramArrayOfByte = null;
      }
      catch (JSONException paramArrayOfByte)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.TMAssistantSDKChannelDataItem", paramArrayOfByte, "", new Object[0]);
          continue;
          paramArrayOfByte = null;
        }
      }
    }
  }

  public byte[] getBuffer()
  {
    AppMethodBeat.i(75620);
    Object localObject1 = new JSONObject();
    try
    {
      ((JSONObject)localObject1).put("mHostPackageName", this.mHostPackageName);
      ((JSONObject)localObject1).put("mHostVersion", this.mHostVersion);
      ((JSONObject)localObject1).put("mHostUserIdentity", this.mHostUserIdentity);
      ((JSONObject)localObject1).put("mDataItemType", this.mDataItemType);
      ((JSONObject)localObject1).put("mDataItemAction", this.mDataItemAction);
      ((JSONObject)localObject1).put("mDataItemStartTime", this.mDataItemStartTime);
      ((JSONObject)localObject1).put("mDataItemEndTime", this.mDataItemEndTime);
      ((JSONObject)localObject1).put("mDataItemVersion", this.mDataItemVersion);
      Object localObject3;
      if ((this.mDataItemVersion > 0) && (this.mIPCData != null))
      {
        localObject3 = Base64.encodeToString(this.mIPCData, 0);
        if (localObject3 != null)
          ((JSONObject)localObject1).put("mIPCData", localObject3);
      }
      localObject1 = ((JSONObject)localObject1).toString();
      if (localObject1 != null)
      {
        localObject3 = ((String)localObject1).getBytes("UTF-8");
        if (localObject3 != null)
        {
          localObject1 = new com/tencent/tmassistantsdk/util/Cryptor;
          ((Cryptor)localObject1).<init>();
          localObject1 = ((Cryptor)localObject1).encrypt((byte[])localObject3, "&-*)Wb5_U,[^!9'+".getBytes());
          AppMethodBeat.o(75620);
          return localObject1;
        }
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TMAssistantSDKChannelDataItem", localJSONException, "", new Object[0]);
        Object localObject2 = null;
        AppMethodBeat.o(75620);
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TMAssistantSDKChannelDataItem", localUnsupportedEncodingException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem
 * JD-Core Version:    0.6.2
 */