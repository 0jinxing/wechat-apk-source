package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class jl extends AsyncTask<Object, Void, Void>
{
  private Handler a;
  private String b;
  private WeakReference<jk> c;

  public jl(Handler paramHandler, jk paramjk, String paramString1, String paramString2)
  {
    AppMethodBeat.i(100055);
    this.a = paramHandler;
    this.c = new WeakReference(paramjk);
    this.b = ic.a(paramString1, paramString2);
    AppMethodBeat.o(100055);
  }

  private void a(int paramInt, String paramString)
  {
    AppMethodBeat.i(100061);
    Object localObject = new ArrayList(4);
    ((List)localObject).add("腾讯地图鉴权失败，请访问 lbs.qq.com 检查 key 配置");
    ((List)localObject).add("错误码：".concat(String.valueOf(paramInt)));
    ((List)localObject).add("错误信息：".concat(String.valueOf(paramString)));
    paramString = new StringBuilder(1024);
    paramString.append("Auth Fail:\n");
    char[] arrayOfChar = new char[81];
    Arrays.fill(arrayOfChar, '*');
    arrayOfChar[80] = ((char)10);
    paramString.append(arrayOfChar);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
      paramString.append((String)((Iterator)localObject).next()).append("\n");
    paramString.append(arrayOfChar);
    AppMethodBeat.o(100061);
  }

  private void a(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(100057);
    if (paramJSONObject == null)
    {
      if ((this.c != null) && (this.c.get() != null))
        ((jk)this.c.get()).a(null, null);
      AppMethodBeat.o(100057);
    }
    while (true)
    {
      return;
      JSONArray localJSONArray = paramJSONObject.optJSONObject("custom_map_style").optJSONArray("style_list");
      paramJSONObject = b(paramJSONObject.optJSONObject("indoor_map"));
      if ((this.c != null) && (this.c.get() != null))
        ((jk)this.c.get()).a(localJSONArray, paramJSONObject);
      AppMethodBeat.o(100057);
    }
  }

  private o b(JSONObject paramJSONObject)
  {
    Object localObject = null;
    AppMethodBeat.i(100058);
    if (paramJSONObject == null)
    {
      AppMethodBeat.o(100058);
      paramJSONObject = localObject;
    }
    while (true)
    {
      return paramJSONObject;
      int i = paramJSONObject.optInt("enable", -1);
      int j = paramJSONObject.optInt("type", -1);
      if ((i == -1) || (j == -1))
      {
        AppMethodBeat.o(100058);
        paramJSONObject = localObject;
      }
      else
      {
        paramJSONObject = new o(i, j, paramJSONObject.optJSONArray("building_list"));
        AppMethodBeat.o(100058);
      }
    }
  }

  private void b()
  {
    AppMethodBeat.i(100060);
    if (this.a != null)
    {
      Object localObject = new li();
      ((li)localObject).a = 3;
      localObject = this.a.obtainMessage(((li)localObject).a, localObject);
      this.a.sendMessage((Message)localObject);
    }
    AppMethodBeat.o(100060);
  }

  protected Void a(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(100059);
    a();
    AppMethodBeat.o(100059);
    return null;
  }

  // ERROR //
  public void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 182
    //   4: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 187	com/tencent/tencentmap/mapsdk/a/ds:a	()Lcom/tencent/tencentmap/mapsdk/a/ds;
    //   10: aload_0
    //   11: getfield 40	com/tencent/tencentmap/mapsdk/maps/a/jl:b	Ljava/lang/String;
    //   14: invokevirtual 190	com/tencent/tencentmap/mapsdk/a/ds:a	(Ljava/lang/String;)Lcom/tencent/tencentmap/mapsdk/a/dt;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnonnull +18 -> 37
    //   22: ldc 182
    //   24: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: return
    //   28: astore_2
    //   29: ldc 182
    //   31: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   34: goto -7 -> 27
    //   37: aload_2
    //   38: getfield 193	com/tencent/tencentmap/mapsdk/a/dt:b	Ljava/lang/String;
    //   41: astore_3
    //   42: aload_2
    //   43: getfield 196	com/tencent/tencentmap/mapsdk/a/dt:a	[B
    //   46: astore 4
    //   48: new 62	java/lang/String
    //   51: astore_2
    //   52: aload_2
    //   53: aload 4
    //   55: aload_3
    //   56: invokespecial 199	java/lang/String:<init>	([BLjava/lang/String;)V
    //   59: new 123	org/json/JSONObject
    //   62: astore_3
    //   63: aload_3
    //   64: aload_2
    //   65: invokespecial 202	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   68: aload_3
    //   69: ldc 204
    //   71: invokevirtual 207	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   74: astore_2
    //   75: aload_0
    //   76: aload_2
    //   77: ldc 209
    //   79: invokevirtual 207	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   82: invokespecial 211	com/tencent/tencentmap/mapsdk/maps/a/jl:a	(Lorg/json/JSONObject;)V
    //   85: aload_3
    //   86: ldc 213
    //   88: invokevirtual 207	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   91: astore_2
    //   92: aload_2
    //   93: ldc 215
    //   95: invokevirtual 219	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   98: istore 5
    //   100: aload_2
    //   101: ldc 221
    //   103: invokevirtual 224	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   106: astore_2
    //   107: iload 5
    //   109: ifne +96 -> 205
    //   112: iconst_0
    //   113: putstatic 227	com/tencent/tencentmap/mapsdk/maps/a/ic:e	I
    //   116: invokestatic 233	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   119: iconst_1
    //   120: invokevirtual 236	java/util/Calendar:get	(I)I
    //   123: putstatic 239	com/tencent/tencentmap/mapsdk/maps/a/ic:f	I
    //   126: invokestatic 233	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   129: iconst_2
    //   130: invokevirtual 236	java/util/Calendar:get	(I)I
    //   133: putstatic 242	com/tencent/tencentmap/mapsdk/maps/a/ic:g	I
    //   136: invokestatic 233	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   139: iconst_5
    //   140: invokevirtual 236	java/util/Calendar:get	(I)I
    //   143: putstatic 245	com/tencent/tencentmap/mapsdk/maps/a/ic:h	I
    //   146: aload_0
    //   147: invokespecial 247	com/tencent/tencentmap/mapsdk/maps/a/jl:b	()V
    //   150: ldc 182
    //   152: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: goto -128 -> 27
    //   158: astore_2
    //   159: ldc 182
    //   161: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: goto -137 -> 27
    //   167: astore_2
    //   168: ldc 182
    //   170: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: goto -146 -> 27
    //   176: astore_2
    //   177: aconst_null
    //   178: astore_2
    //   179: goto -104 -> 75
    //   182: astore_2
    //   183: aload_0
    //   184: aconst_null
    //   185: invokespecial 211	com/tencent/tencentmap/mapsdk/maps/a/jl:a	(Lorg/json/JSONObject;)V
    //   188: goto -103 -> 85
    //   191: astore_1
    //   192: iconst_0
    //   193: istore 5
    //   195: goto -95 -> 100
    //   198: astore_2
    //   199: ldc 249
    //   201: astore_2
    //   202: goto -95 -> 107
    //   205: aload_0
    //   206: iload 5
    //   208: aload_2
    //   209: invokespecial 251	com/tencent/tencentmap/mapsdk/maps/a/jl:a	(ILjava/lang/String;)V
    //   212: iload 5
    //   214: sipush -400
    //   217: if_icmpge +10 -> 227
    //   220: iconst_m1
    //   221: putstatic 227	com/tencent/tencentmap/mapsdk/maps/a/ic:e	I
    //   224: goto -108 -> 116
    //   227: iconst_1
    //   228: putstatic 227	com/tencent/tencentmap/mapsdk/maps/a/ic:e	I
    //   231: goto -115 -> 116
    //   234: astore_2
    //   235: aload_1
    //   236: astore_2
    //   237: goto -145 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   7	18	28	java/lang/Exception
    //   48	59	158	java/io/UnsupportedEncodingException
    //   59	68	167	java/lang/Exception
    //   68	75	176	java/lang/Exception
    //   75	85	182	java/lang/Exception
    //   92	100	191	java/lang/Exception
    //   100	107	198	org/json/JSONException
    //   85	92	234	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jl
 * JD-Core Version:    0.6.2
 */