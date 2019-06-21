package com.tencent.mm.plugin.ipcall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.ipcall.a.g.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  private static c nvp;
  boolean bZi;
  private ArrayList<Integer> nvq;
  ArrayList<Integer> nvr;

  private c()
  {
    AppMethodBeat.i(21716);
    this.nvq = new ArrayList();
    this.nvr = new ArrayList();
    this.bZi = false;
    AppMethodBeat.o(21716);
  }

  private void OM(String paramString)
  {
    AppMethodBeat.i(21719);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(21719);
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = localJSONObject.getJSONArray("restriction");
        ab.d("MicroMsg.IPCallCountryCodeConfig", "restrictionCountryCode: %d", new Object[] { Integer.valueOf(paramString.length()) });
        this.nvr.clear();
        for (int i = 0; i < paramString.length(); i++)
        {
          int j = paramString.getInt(i);
          this.nvr.add(Integer.valueOf(j));
        }
        AppMethodBeat.o(21719);
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.IPCallCountryCodeConfig", paramString, "", new Object[0]);
        ab.e("MicroMsg.IPCallCountryCodeConfig", "initConfigFromContent error: %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(21719);
      }
    }
  }

  public static c bHc()
  {
    AppMethodBeat.i(21717);
    if (nvp == null)
      nvp = new c();
    c localc = nvp;
    AppMethodBeat.o(21717);
    return localc;
  }

  private void bHd()
  {
    AppMethodBeat.i(21720);
    this.nvq.clear();
    Object localObject = g.Nu().getValue("WeChatOutTopCountryCode");
    ab.d("MicroMsg.IPCallCountryCodeConfig", "popularCountryConfig: %s", new Object[] { localObject });
    String[] arrayOfString;
    int i;
    if (!bo.isNullOrNil((String)localObject))
    {
      arrayOfString = ((String)localObject).trim().split(",");
      i = arrayOfString.length;
    }
    while (true)
    {
      try
      {
        int j = arrayOfString.length;
        int k = 0;
        if (k < j)
        {
          localObject = Integer.valueOf(bo.getInt(arrayOfString[k], 0));
          this.nvq.add(localObject);
          i.bHy().O(((Integer)localObject).intValue(), i);
          i--;
          k++;
          continue;
        }
        AppMethodBeat.o(21720);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        ab.e("MicroMsg.IPCallCountryCodeConfig", "initPopularCountryFromDynamicConfig error: %s", new Object[] { localNumberFormatException.getMessage() });
      }
      AppMethodBeat.o(21720);
    }
  }

  private void bHe()
  {
    AppMethodBeat.i(21721);
    ArrayList localArrayList = i.bHy().bIa();
    if (localArrayList.size() > 0)
    {
      this.nvq = localArrayList;
      AppMethodBeat.o(21721);
    }
    while (true)
    {
      return;
      bHd();
      AppMethodBeat.o(21721);
    }
  }

  public final void ON(String paramString)
  {
    AppMethodBeat.i(21722);
    if (!this.bZi)
      ih(false);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(21722);
    while (true)
    {
      return;
      paramString = paramString.replace("+", "");
      i.bHy().O(bo.getInt(paramString, 0), bo.anU());
      bHe();
      AppMethodBeat.o(21722);
    }
  }

  public final List<Integer> bHf()
  {
    AppMethodBeat.i(21723);
    if (!this.bZi)
      ih(false);
    ArrayList localArrayList = this.nvq;
    AppMethodBeat.o(21723);
    return localArrayList;
  }

  // ERROR //
  public final void ih(boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: sipush 21718
    //   7: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: getfield 31	com/tencent/mm/plugin/ipcall/a/c:bZi	Z
    //   14: ifeq +14 -> 28
    //   17: iload_1
    //   18: ifne +10 -> 28
    //   21: sipush 21718
    //   24: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: return
    //   28: aload_0
    //   29: invokespecial 186	com/tencent/mm/plugin/ipcall/a/c:bHe	()V
    //   32: new 192	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 193	java/lang/StringBuilder:<init>	()V
    //   39: getstatic 199	com/tencent/mm/compatible/util/e:eSj	Ljava/lang/String;
    //   42: invokevirtual 203	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: ldc 205
    //   47: invokevirtual 203	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: astore 4
    //   55: aload_2
    //   56: astore 5
    //   58: new 210	java/io/File
    //   61: astore 6
    //   63: aload_2
    //   64: astore 5
    //   66: aload 6
    //   68: aload 4
    //   70: invokespecial 211	java/io/File:<init>	(Ljava/lang/String;)V
    //   73: aload_2
    //   74: astore 5
    //   76: aload 6
    //   78: invokevirtual 215	java/io/File:exists	()Z
    //   81: ifne +43 -> 124
    //   84: aload_2
    //   85: astore 5
    //   87: ldc 57
    //   89: ldc 217
    //   91: iconst_1
    //   92: anewarray 4	java/lang/Object
    //   95: dup
    //   96: iconst_0
    //   97: aload 4
    //   99: aastore
    //   100: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: aload_2
    //   104: astore 5
    //   106: aload_0
    //   107: iconst_1
    //   108: putfield 31	com/tencent/mm/plugin/ipcall/a/c:bZi	Z
    //   111: aconst_null
    //   112: invokestatic 223	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   115: sipush 21718
    //   118: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: goto -94 -> 27
    //   124: aload_2
    //   125: astore 5
    //   127: new 225	java/io/FileInputStream
    //   130: dup
    //   131: aload 6
    //   133: invokespecial 228	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   136: astore_2
    //   137: new 230	java/io/InputStreamReader
    //   140: astore 5
    //   142: aload 5
    //   144: aload_2
    //   145: invokespecial 232	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   148: new 234	java/io/BufferedReader
    //   151: astore 6
    //   153: aload 6
    //   155: aload 5
    //   157: invokespecial 237	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   160: ldc 90
    //   162: astore 5
    //   164: aload 6
    //   166: invokevirtual 240	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   169: astore_3
    //   170: aload_3
    //   171: ifnull +32 -> 203
    //   174: new 192	java/lang/StringBuilder
    //   177: astore 4
    //   179: aload 4
    //   181: invokespecial 193	java/lang/StringBuilder:<init>	()V
    //   184: aload 4
    //   186: aload 5
    //   188: invokevirtual 203	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: aload_3
    //   192: invokevirtual 203	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: astore 5
    //   200: goto -36 -> 164
    //   203: ldc 57
    //   205: ldc 242
    //   207: iconst_1
    //   208: anewarray 4	java/lang/Object
    //   211: dup
    //   212: iconst_0
    //   213: aload 5
    //   215: aastore
    //   216: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: aload_0
    //   220: aload 5
    //   222: invokespecial 244	com/tencent/mm/plugin/ipcall/a/c:OM	(Ljava/lang/String;)V
    //   225: aload_0
    //   226: iconst_1
    //   227: putfield 31	com/tencent/mm/plugin/ipcall/a/c:bZi	Z
    //   230: aload_2
    //   231: invokestatic 223	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   234: sipush 21718
    //   237: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   240: goto -213 -> 27
    //   243: astore 6
    //   245: aload_3
    //   246: astore_2
    //   247: aload_2
    //   248: astore 5
    //   250: ldc 57
    //   252: aload 6
    //   254: ldc 90
    //   256: iconst_0
    //   257: anewarray 4	java/lang/Object
    //   260: invokestatic 94	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   263: aload_2
    //   264: astore 5
    //   266: ldc 57
    //   268: ldc 246
    //   270: iconst_1
    //   271: anewarray 4	java/lang/Object
    //   274: dup
    //   275: iconst_0
    //   276: aload 6
    //   278: invokevirtual 100	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   281: aastore
    //   282: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: aload_2
    //   286: invokestatic 223	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   289: sipush 21718
    //   292: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   295: goto -268 -> 27
    //   298: astore 6
    //   300: aload 5
    //   302: invokestatic 223	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   305: sipush 21718
    //   308: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   311: aload 6
    //   313: athrow
    //   314: astore 6
    //   316: aload_2
    //   317: astore 5
    //   319: goto -19 -> 300
    //   322: astore 6
    //   324: goto -77 -> 247
    //
    // Exception table:
    //   from	to	target	type
    //   58	63	243	java/lang/Exception
    //   66	73	243	java/lang/Exception
    //   76	84	243	java/lang/Exception
    //   87	103	243	java/lang/Exception
    //   106	111	243	java/lang/Exception
    //   127	137	243	java/lang/Exception
    //   58	63	298	finally
    //   66	73	298	finally
    //   76	84	298	finally
    //   87	103	298	finally
    //   106	111	298	finally
    //   127	137	298	finally
    //   250	263	298	finally
    //   266	285	298	finally
    //   137	160	314	finally
    //   164	170	314	finally
    //   174	200	314	finally
    //   203	230	314	finally
    //   137	160	322	java/lang/Exception
    //   164	170	322	java/lang/Exception
    //   174	200	322	java/lang/Exception
    //   203	230	322	java/lang/Exception
  }

  public final boolean xf(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(21724);
    if (!this.bZi)
      ih(false);
    if ((this.nvr == null) || (this.nvr.size() <= 0))
      AppMethodBeat.o(21724);
    while (true)
    {
      return bool;
      bool = this.nvr.contains(Integer.valueOf(paramInt));
      AppMethodBeat.o(21724);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.c
 * JD-Core Version:    0.6.2
 */