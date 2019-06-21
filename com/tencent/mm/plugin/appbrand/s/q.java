package com.tencent.mm.plugin.appbrand.s;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.h.k;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class q
{
  // ERROR //
  public static final q.b a(i parami, Map paramMap, q.a parama)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc 15
    //   4: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: ifnull +7 -> 15
    //   11: aload_1
    //   12: ifnonnull +59 -> 71
    //   15: aload_0
    //   16: ifnonnull +49 -> 65
    //   19: iconst_1
    //   20: istore 4
    //   22: aload_1
    //   23: ifnonnull +5 -> 28
    //   26: iconst_1
    //   27: istore_3
    //   28: ldc 23
    //   30: ldc 25
    //   32: iconst_2
    //   33: anewarray 4	java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: iload 4
    //   40: invokestatic 31	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   43: aastore
    //   44: dup
    //   45: iconst_1
    //   46: iload_3
    //   47: invokestatic 31	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   50: aastore
    //   51: invokestatic 37	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   54: getstatic 41	com/tencent/mm/plugin/appbrand/s/q$b:iRI	Lcom/tencent/mm/plugin/appbrand/s/q$b;
    //   57: astore_0
    //   58: ldc 15
    //   60: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: aload_0
    //   64: areturn
    //   65: iconst_0
    //   66: istore 4
    //   68: goto -46 -> 22
    //   71: aload_2
    //   72: astore 5
    //   74: aload_2
    //   75: ifnonnull +12 -> 87
    //   78: new 6	com/tencent/mm/plugin/appbrand/s/q$a
    //   81: dup
    //   82: invokespecial 48	com/tencent/mm/plugin/appbrand/s/q$a:<init>	()V
    //   85: astore 5
    //   87: aload_0
    //   88: ldc 50
    //   90: invokeinterface 56 2 0
    //   95: checkcast 50	com/tencent/mm/plugin/appbrand/h/k
    //   98: astore 6
    //   100: new 58	org/json/JSONArray
    //   103: dup
    //   104: invokespecial 59	org/json/JSONArray:<init>	()V
    //   107: astore_2
    //   108: aload_1
    //   109: invokeinterface 65 1 0
    //   114: invokeinterface 71 1 0
    //   119: astore 7
    //   121: iconst_0
    //   122: istore 8
    //   124: iconst_0
    //   125: istore 9
    //   127: aload 7
    //   129: invokeinterface 77 1 0
    //   134: ifeq +247 -> 381
    //   137: aload 7
    //   139: invokeinterface 81 1 0
    //   144: checkcast 83	java/util/Map$Entry
    //   147: astore_0
    //   148: aload_0
    //   149: invokeinterface 86 1 0
    //   154: checkcast 88	java/lang/String
    //   157: astore 10
    //   159: aload_0
    //   160: invokeinterface 91 1 0
    //   165: astore 11
    //   167: aload 11
    //   169: ifnull -42 -> 127
    //   172: aload 11
    //   174: instanceof 93
    //   177: ifeq -50 -> 127
    //   180: new 95	org/json/JSONObject
    //   183: astore_0
    //   184: aload_0
    //   185: invokespecial 96	org/json/JSONObject:<init>	()V
    //   188: aload_0
    //   189: aload 5
    //   191: getfield 100	com/tencent/mm/plugin/appbrand/s/q$a:iRF	Ljava/lang/String;
    //   194: aload 10
    //   196: invokevirtual 104	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   199: pop
    //   200: aload 6
    //   202: ifnull +118 -> 320
    //   205: aload 6
    //   207: invokeinterface 108 1 0
    //   212: istore 12
    //   214: iload 12
    //   216: iconst_m1
    //   217: if_icmpeq +103 -> 320
    //   220: aload 11
    //   222: checkcast 93	java/nio/ByteBuffer
    //   225: astore 10
    //   227: aload 10
    //   229: ifnonnull +42 -> 271
    //   232: ldc 23
    //   234: ldc 110
    //   236: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   239: goto -112 -> 127
    //   242: astore_0
    //   243: ldc 23
    //   245: ldc 116
    //   247: iconst_1
    //   248: anewarray 4	java/lang/Object
    //   251: dup
    //   252: iconst_0
    //   253: aload_0
    //   254: invokevirtual 120	org/json/JSONException:getMessage	()Ljava/lang/String;
    //   257: aastore
    //   258: invokestatic 122	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   261: aload 7
    //   263: invokeinterface 125 1 0
    //   268: goto -141 -> 127
    //   271: aload 6
    //   273: iload 12
    //   275: aload 10
    //   277: invokeinterface 129 3 0
    //   282: aload_0
    //   283: aload 5
    //   285: getfield 132	com/tencent/mm/plugin/appbrand/s/q$a:iRG	Ljava/lang/String;
    //   288: iload 12
    //   290: invokevirtual 135	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   293: pop
    //   294: aload 10
    //   296: invokevirtual 138	java/nio/ByteBuffer:capacity	()I
    //   299: istore 12
    //   301: iload 9
    //   303: iload 12
    //   305: iadd
    //   306: istore 9
    //   308: aload_2
    //   309: aload_0
    //   310: invokevirtual 141	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   313: pop
    //   314: iconst_1
    //   315: istore 8
    //   317: goto -56 -> 261
    //   320: new 88	java/lang/String
    //   323: astore 10
    //   325: aload 10
    //   327: aload 11
    //   329: checkcast 93	java/nio/ByteBuffer
    //   332: invokevirtual 145	java/nio/ByteBuffer:array	()[B
    //   335: iconst_2
    //   336: invokestatic 151	android/util/Base64:encode	([BI)[B
    //   339: ldc 153
    //   341: invokespecial 156	java/lang/String:<init>	([BLjava/lang/String;)V
    //   344: aload_0
    //   345: aload 5
    //   347: getfield 159	com/tencent/mm/plugin/appbrand/s/q$a:iRH	Ljava/lang/String;
    //   350: aload 10
    //   352: invokevirtual 104	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   355: pop
    //   356: goto -48 -> 308
    //   359: astore_0
    //   360: ldc 23
    //   362: ldc 161
    //   364: iconst_1
    //   365: anewarray 4	java/lang/Object
    //   368: dup
    //   369: iconst_0
    //   370: aload_0
    //   371: invokevirtual 162	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
    //   374: aastore
    //   375: invokestatic 122	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   378: goto -117 -> 261
    //   381: aload 6
    //   383: ifnull +85 -> 468
    //   386: iconst_1
    //   387: istore 4
    //   389: ldc 23
    //   391: ldc 164
    //   393: iconst_2
    //   394: anewarray 4	java/lang/Object
    //   397: dup
    //   398: iconst_0
    //   399: iload 4
    //   401: invokestatic 31	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   404: aastore
    //   405: dup
    //   406: iconst_1
    //   407: iload 9
    //   409: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   412: aastore
    //   413: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   416: iload 9
    //   418: aload 5
    //   420: getfield 175	com/tencent/mm/plugin/appbrand/s/q$a:hfX	I
    //   423: if_icmple +51 -> 474
    //   426: ldc 23
    //   428: ldc 177
    //   430: iconst_2
    //   431: anewarray 4	java/lang/Object
    //   434: dup
    //   435: iconst_0
    //   436: iload 9
    //   438: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   441: aastore
    //   442: dup
    //   443: iconst_1
    //   444: aload 5
    //   446: getfield 175	com/tencent/mm/plugin/appbrand/s/q$a:hfX	I
    //   449: invokestatic 169	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   452: aastore
    //   453: invokestatic 37	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   456: getstatic 180	com/tencent/mm/plugin/appbrand/s/q$b:iRJ	Lcom/tencent/mm/plugin/appbrand/s/q$b;
    //   459: astore_0
    //   460: ldc 15
    //   462: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   465: goto -402 -> 63
    //   468: iconst_0
    //   469: istore 4
    //   471: goto -82 -> 389
    //   474: iload 8
    //   476: ifeq +16 -> 492
    //   479: aload_1
    //   480: aload 5
    //   482: getfield 183	com/tencent/mm/plugin/appbrand/s/q$a:iRE	Ljava/lang/String;
    //   485: aload_2
    //   486: invokeinterface 186 3 0
    //   491: pop
    //   492: getstatic 41	com/tencent/mm/plugin/appbrand/s/q$b:iRI	Lcom/tencent/mm/plugin/appbrand/s/q$b;
    //   495: astore_0
    //   496: ldc 15
    //   498: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   501: goto -438 -> 63
    //   504: astore_0
    //   505: goto -145 -> 360
    //   508: astore_0
    //   509: goto -266 -> 243
    //
    // Exception table:
    //   from	to	target	type
    //   180	200	242	org/json/JSONException
    //   205	214	242	org/json/JSONException
    //   220	227	242	org/json/JSONException
    //   232	239	242	org/json/JSONException
    //   271	301	242	org/json/JSONException
    //   320	356	242	org/json/JSONException
    //   180	200	359	java/io/UnsupportedEncodingException
    //   205	214	359	java/io/UnsupportedEncodingException
    //   220	227	359	java/io/UnsupportedEncodingException
    //   232	239	359	java/io/UnsupportedEncodingException
    //   271	301	359	java/io/UnsupportedEncodingException
    //   320	356	359	java/io/UnsupportedEncodingException
    //   308	314	504	java/io/UnsupportedEncodingException
    //   308	314	508	org/json/JSONException
  }

  public static final q.b a(i parami, JSONObject paramJSONObject, q.a parama)
  {
    boolean bool1 = false;
    AppMethodBeat.i(91183);
    boolean bool2;
    if ((parami == null) || (paramJSONObject == null))
      if (parami == null)
      {
        bool2 = true;
        if (paramJSONObject == null)
          bool1 = true;
        ab.e("MicroMsg.NativeBufferUtil", "processNativeBufferToJs fail, invalid argument, jsruntime is null:[%b], data is null:[%b]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        parami = q.b.iRI;
        AppMethodBeat.o(91183);
      }
    while (true)
    {
      return parami;
      bool2 = false;
      break;
      q.a locala = parama;
      if (parama == null)
        locala = new q.a();
      parama = paramJSONObject.optJSONArray(locala.iRE);
      if (parama == null)
      {
        parami = q.b.iRI;
        AppMethodBeat.o(91183);
      }
      else
      {
        paramJSONObject.remove(locala.iRE);
        int i = parama.length();
        int j = 0;
        int k = 0;
        if (j < i)
        {
          Object localObject = parama.optJSONObject(j);
          String str;
          int m;
          if (localObject != null)
          {
            str = ((JSONObject)localObject).optString(locala.iRF);
            if (!bo.isNullOrNil(str))
            {
              m = ((JSONObject)localObject).optInt(locala.iRG, -1);
              if (m != -1);
            }
          }
          while (true)
            try
            {
              localObject = ((JSONObject)localObject).optString(locala.iRH, "");
              if (bo.isNullOrNil((String)localObject))
              {
                ab.i("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs base64 is null");
                paramJSONObject.put(str, ByteBuffer.allocate(0));
                j++;
                break;
              }
              paramJSONObject.put(str, ByteBuffer.wrap(Base64.decode(((String)localObject).getBytes(Charset.forName("UTF-8")), 2)));
              continue;
              localObject = (k)parami.af(k.class);
              if (localObject == null)
              {
                ab.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs bufferAddon is null, not support");
              }
              else
              {
                localObject = ((k)localObject).getNativeBuffer(m);
                if (localObject == null)
                {
                  ab.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs byteBuffer is null");
                }
                else
                {
                  ((ByteBuffer)localObject).position(0);
                  paramJSONObject.put(str, localObject);
                  m = ((ByteBuffer)localObject).capacity();
                  k = m + k;
                }
              }
            }
            catch (JSONException localJSONException)
            {
              ab.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs JSONException :%s", new Object[] { localJSONException.getMessage() });
            }
        }
        ab.i("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs bufferSize %d", new Object[] { Integer.valueOf(k) });
        if (k > locala.hfX)
        {
          ab.e("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs fail, size exceed limit, bufferSize = %d, limit = %d", new Object[] { Integer.valueOf(k), Integer.valueOf(locala.hfX) });
          parami = q.b.iRJ;
          AppMethodBeat.o(91183);
        }
        else
        {
          parami = q.b.iRI;
          AppMethodBeat.o(91183);
        }
      }
    }
  }

  public static ByteBuffer al(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(91181);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(91181);
    }
    while (true)
    {
      return paramArrayOfByte;
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramArrayOfByte.length);
      localByteBuffer.put(paramArrayOfByte, 0, paramArrayOfByte.length);
      localByteBuffer.rewind();
      AppMethodBeat.o(91181);
      paramArrayOfByte = localByteBuffer;
    }
  }

  public static void m(c paramc, String paramString)
  {
    AppMethodBeat.i(91184);
    HashMap localHashMap = new HashMap();
    localHashMap.put("message", "convert native buffer parameter fail, event=" + paramString + ", error=native buffer exceed size limit");
    localHashMap.put("stack", "");
    paramc.bX("onError", new JSONObject(localHashMap).toString());
    AppMethodBeat.o(91184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.q
 * JD-Core Version:    0.6.2
 */