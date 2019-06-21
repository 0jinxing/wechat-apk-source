package com.tencent.recovery.wx.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.recovery.util.Util;
import java.util.UUID;

public class WXUtil
{
  public static final String QZ(int paramInt)
  {
    return "KeyConfigHttpCode[" + paramInt + "]";
  }

  public static final String Ra(int paramInt)
  {
    return "KeyPatchHttpCode[" + paramInt + "]";
  }

  public static final String atN(String paramString)
  {
    if (paramString.contains("?"));
    for (paramString = paramString + "uuid=" + UUID.randomUUID().toString(); ; paramString = paramString + "?uuid=" + UUID.randomUUID().toString())
      return paramString;
  }

  public static String iG(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getPackageName() + "_preferences", 0).getString("last_login_uin", "0");
  }

  public static String iH(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(paramContext.getPackageName() + "_preferences", 0);
    Object localObject1 = localSharedPreferences.getString("login_weixin_username", "");
    Object localObject2 = localObject1;
    if (Util.isNullOrNil((String)localObject1))
      localObject2 = localSharedPreferences.getString("login_user_name", "");
    localObject1 = localObject2;
    if (Util.isNullOrNil((String)localObject2))
      localObject1 = String.valueOf(Util.iB(paramContext));
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.wx.util.WXUtil
 * JD-Core Version:    0.6.2
 */