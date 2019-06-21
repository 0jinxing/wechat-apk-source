package com.tencent.mm.storage.emotion;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class a extends j<EmojiGroupInfo>
  implements g.a
{
  public static final String[] fnj;
  public com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(62757);
    fnj = new String[] { j.a(EmojiGroupInfo.ccO, "EmojiGroupInfo") };
    AppMethodBeat.o(62757);
  }

  public a(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, EmojiGroupInfo.ccO, "EmojiGroupInfo", null);
    this.bSd = parame;
  }

  private int Jp(String paramString)
  {
    AppMethodBeat.i(62755);
    long l = System.currentTimeMillis();
    Object localObject = null;
    String str = null;
    while (true)
    {
      try
      {
        paramString = this.bSd.a("select count(*) from EmojiInfo where groupId= ? and temp=?", new String[] { paramString, "0" }, 2);
        if (paramString == null)
          break label231;
        str = paramString;
        localObject = paramString;
        if (!paramString.moveToFirst())
          break label231;
        str = paramString;
        localObject = paramString;
        i = paramString.getInt(0);
        j = i;
        if (paramString != null)
        {
          paramString.close();
          j = i;
        }
        ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "count product id use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(62755);
        return j;
      }
      catch (Exception localException)
      {
        localObject = str;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", "exception:%s", new Object[] { bo.l(localException) });
        localObject = str;
        paramString = new java/lang/StringBuilder;
        localObject = str;
        paramString.<init>("[countProductId]Count ProductId fail.");
        localObject = str;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", localException.getMessage());
        if (str != null)
        {
          str.close();
          j = 0;
          continue;
        }
      }
      finally
      {
        if (localObject != null)
          ((Cursor)localObject).close();
        AppMethodBeat.o(62755);
      }
      int j = 0;
      continue;
      label231: int i = 0;
    }
  }

  private static final String Mt(int paramInt)
  {
    AppMethodBeat.i(62747);
    String str = " ( type = '" + paramInt + "' ) ";
    AppMethodBeat.o(62747);
    return str;
  }

  private static final String Mu(int paramInt)
  {
    AppMethodBeat.i(62748);
    String str = " ( " + Mt(paramInt) + " and ( ( ( flag & 256 ) = 0 )  or ( flag is null ) )  ) ";
    AppMethodBeat.o(62748);
    return str;
  }

  private static boolean d(EmojiGroupInfo paramEmojiGroupInfo)
  {
    if (paramEmojiGroupInfo == null);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      paramEmojiGroupInfo.field_flag &= -257;
    }
  }

  public static boolean duE()
  {
    AppMethodBeat.i(62737);
    boolean bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(208912, Boolean.FALSE)).booleanValue();
    AppMethodBeat.o(62737);
    return bool;
  }

  private static String duH()
  {
    AppMethodBeat.i(62745);
    String str = Mt(EmojiGroupInfo.TYPE_SYSTEM) + " or " + Mt(EmojiGroupInfo.TYPE_CUSTOM) + " or " + Mt(EmojiGroupInfo.xZZ) + " or " + Mt(EmojiGroupInfo.yab);
    AppMethodBeat.o(62745);
    return str;
  }

  private static final String duI()
  {
    AppMethodBeat.i(62746);
    String str = " ( " + Mt(EmojiGroupInfo.xZZ) + " and  ( status = '7' ) " + " ) ";
    AppMethodBeat.o(62746);
    return str;
  }

  private int dux()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(62729);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    Object localObject5 = localObject1;
    try
    {
      com.tencent.mm.sdk.e.e locale = this.bSd;
      localObject3 = localObject2;
      localObject5 = localObject1;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localObject3 = localObject2;
      localObject5 = localObject1;
      localStringBuilder.<init>();
      localObject3 = localObject2;
      localObject5 = localObject1;
      localObject2 = locale.a("select  count(*) from EmojiInfo where catalog=?", new String[] { EmojiGroupInfo.yae }, 2);
      int k = j;
      if (localObject2 != null)
      {
        k = j;
        localObject3 = localObject2;
        localObject5 = localObject2;
        if (((Cursor)localObject2).moveToFirst())
        {
          localObject3 = localObject2;
          localObject5 = localObject2;
          k = ((Cursor)localObject2).getInt(0);
        }
      }
      j = k;
      if (localObject2 != null)
      {
        ((Cursor)localObject2).close();
        j = k;
      }
      AppMethodBeat.o(62729);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject5 = localObject3;
        localObject2 = new java/lang/StringBuilder;
        localObject5 = localObject3;
        ((StringBuilder)localObject2).<init>("Check GroupId Exist Faild.");
        localObject5 = localObject3;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", localException.getMessage());
        j = i;
        if (localObject3 != null)
        {
          localObject3.close();
          j = i;
        }
      }
    }
    finally
    {
      if (localObject5 != null)
        localObject5.close();
      AppMethodBeat.o(62729);
    }
  }

  private ArrayList<EmojiGroupInfo> hj(Context paramContext)
  {
    AppMethodBeat.i(62727);
    EmojiGroupInfo localEmojiGroupInfo = null;
    Element localElement = null;
    NodeList localNodeList = null;
    ArrayList localArrayList = new ArrayList();
    DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
    Object localObject1 = localNodeList;
    Object localObject2 = localEmojiGroupInfo;
    Object localObject3 = localElement;
    try
    {
      ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init,parse xml start.");
      localObject1 = localNodeList;
      localObject2 = localEmojiGroupInfo;
      localObject3 = localElement;
      paramContext = paramContext.getAssets().open("custom_emoji/manifest.xml");
      localObject1 = paramContext;
      localObject2 = paramContext;
      localObject3 = paramContext;
      localNodeList = localDocumentBuilderFactory.newDocumentBuilder().parse(paramContext).getDocumentElement().getElementsByTagName("catalog");
      int i = 0;
      localObject1 = paramContext;
      localObject2 = paramContext;
      localObject3 = paramContext;
      if (i < localNodeList.getLength())
      {
        localObject1 = paramContext;
        localObject2 = paramContext;
        localObject3 = paramContext;
        localEmojiGroupInfo = new com/tencent/mm/storage/emotion/EmojiGroupInfo;
        localObject1 = paramContext;
        localObject2 = paramContext;
        localObject3 = paramContext;
        localEmojiGroupInfo.<init>();
        localObject1 = paramContext;
        localObject2 = paramContext;
        localObject3 = paramContext;
        localElement = (Element)localNodeList.item(i);
        localObject1 = paramContext;
        localObject2 = paramContext;
        localObject3 = paramContext;
        int j = Integer.decode(localElement.getAttribute("id")).intValue();
        localObject1 = paramContext;
        localObject2 = paramContext;
        localObject3 = paramContext;
        int k;
        if (!TextUtils.isEmpty(localElement.getAttribute("sort")))
        {
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "Set Sort id:%d,sort:%d", new Object[] { Integer.valueOf(j), Integer.decode(localElement.getAttribute("sort")) });
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          k = EmojiGroupInfo.yad;
          if ((j & k) != k)
            break label583;
          k = 1;
          label289: if (k == 0)
            break label589;
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          if (dux() <= 0)
          {
            localObject1 = paramContext;
            localObject2 = paramContext;
            localObject3 = paramContext;
            if (!duE())
              break label589;
          }
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          localEmojiGroupInfo.field_sort = -1;
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          com.tencent.mm.kernel.g.RP().Ry().set(208912, Boolean.TRUE);
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "moveCustomEmojiTabToSecond");
        }
        while (true)
        {
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          localEmojiGroupInfo.field_productID = String.valueOf(j);
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          localEmojiGroupInfo.field_packName = localElement.getAttribute("name");
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          if (!TextUtils.isEmpty(localElement.getAttribute("type")))
          {
            localObject1 = paramContext;
            localObject2 = paramContext;
            localObject3 = paramContext;
            localEmojiGroupInfo.field_type = Integer.decode(localElement.getAttribute("type")).intValue();
          }
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          if (!TextUtils.isEmpty(localElement.getAttribute("free")))
          {
            localObject1 = paramContext;
            localObject2 = paramContext;
            localObject3 = paramContext;
            localEmojiGroupInfo.field_packType = Integer.decode(localElement.getAttribute("free")).intValue();
          }
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          if (localEmojiGroupInfo.field_type != EmojiGroupInfo.TYPE_SYSTEM)
          {
            localObject1 = paramContext;
            localObject2 = paramContext;
            localObject3 = paramContext;
            if (localEmojiGroupInfo.field_type != EmojiGroupInfo.TYPE_CUSTOM);
          }
          else
          {
            localObject1 = paramContext;
            localObject2 = paramContext;
            localObject3 = paramContext;
            localArrayList.add(localEmojiGroupInfo);
          }
          i++;
          break;
          label583: k = 0;
          break label289;
          label589: localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          localEmojiGroupInfo.field_sort = (i + 1);
        }
      }
    }
    catch (IOException paramContext)
    {
      localObject3 = localObject1;
      ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", "exception:%s", new Object[] { bo.l(paramContext) });
      localObject3 = localObject1;
      localObject2 = new java/lang/StringBuilder;
      localObject3 = localObject1;
      ((StringBuilder)localObject2).<init>("init emoji group db error.");
      localObject3 = localObject1;
      ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext.getMessage());
      if (localObject1 != null);
      try
      {
        ((InputStream)localObject1).close();
        while (true)
        {
          AppMethodBeat.o(62727);
          return localArrayList;
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          if (localArrayList.size() > 0)
          {
            localObject1 = paramContext;
            localObject2 = paramContext;
            localObject3 = paramContext;
            eI(localArrayList);
          }
          localObject1 = paramContext;
          localObject2 = paramContext;
          localObject3 = paramContext;
          ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init,parse xml end.");
          if (paramContext != null)
            try
            {
              paramContext.close();
            }
            catch (Exception paramContext)
            {
              ab.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext, "", new Object[0]);
            }
        }
      }
      catch (Exception paramContext)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext, "", new Object[0]);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        localObject3 = localObject2;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", "exception:%s", new Object[] { bo.l(paramContext) });
        localObject3 = localObject2;
        localObject1 = new java/lang/StringBuilder;
        localObject3 = localObject2;
        ((StringBuilder)localObject1).<init>("parse xml error; ");
        localObject3 = localObject2;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext.getMessage());
        if (localObject2 != null)
          try
          {
            ((InputStream)localObject2).close();
          }
          catch (Exception paramContext)
          {
            ab.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext, "", new Object[0]);
          }
      }
    }
    finally
    {
      if (localObject3 == null);
    }
    try
    {
      ((InputStream)localObject3).close();
      AppMethodBeat.o(62727);
      throw paramContext;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", localException, "", new Object[0]);
    }
  }

  public final int a(com.tencent.mm.cd.g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final void aj(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(62741);
    h localh = null;
    long l;
    if ((this.bSd instanceof h))
    {
      localh = (h)this.bSd;
      l = localh.iV(Thread.currentThread().getId());
      ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround deleteByGroupIdList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    while (true)
    {
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
      {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext())
          aqd((String)paramArrayList.next());
      }
      if (localh != null)
      {
        localh.mB(l);
        ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end deleteByGroupIdList transaction");
      }
      AppMethodBeat.o(62741);
      return;
      l = -1L;
    }
  }

  public final boolean ak(ArrayList<EmojiGroupInfo> paramArrayList)
  {
    AppMethodBeat.i(62743);
    ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[insertRecommendEmojiGroupInfo]");
    boolean bool = eI(paramArrayList);
    AppMethodBeat.o(62743);
    return bool;
  }

  public final boolean aqc(String paramString)
  {
    Cursor localCursor1 = null;
    Cursor localCursor2 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(62736);
    if (TextUtils.isEmpty(paramString))
      ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", "product id is null.");
    Object localObject2 = "select count(*) from EmojiGroupInfo where productID = '" + paramString + "' AND  ( status = '7' ) " + " AND ( ( ( flag & 256 ) = 0 )  or ( flag is null ) ) ";
    paramString = localCursor1;
    try
    {
      localCursor1 = this.bSd.a((String)localObject2, null, 2);
      if (localCursor1 != null)
      {
        localCursor2 = localCursor1;
        paramString = localCursor1;
        if (localCursor1.moveToFirst())
        {
          localCursor2 = localCursor1;
          paramString = localCursor1;
          int i = localCursor1.getInt(0);
          if (i <= 0);
        }
      }
      for (bool2 = true; ; bool2 = bool1)
      {
        return bool2;
        if (localCursor1 != null)
          localCursor1.close();
        AppMethodBeat.o(62736);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        paramString = localCursor2;
        localObject2 = new java/lang/StringBuilder;
        paramString = localCursor2;
        ((StringBuilder)localObject2).<init>("Check GroupId Exist Faild.");
        paramString = localCursor2;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", localException.getMessage());
        if (localCursor2 != null)
          localCursor2.close();
      }
    }
    finally
    {
      if (paramString != null)
        paramString.close();
      AppMethodBeat.o(62736);
    }
  }

  public final boolean aqd(String paramString)
  {
    AppMethodBeat.i(62740);
    String str;
    if (!bo.isNullOrNil(paramString))
      str = paramString;
    while (true)
    {
      try
      {
        if (paramString.equals("com.tencent.xin.emoticon.tusiji"))
        {
          paramString = new java/lang/StringBuilder;
          paramString.<init>();
          str = EmojiGroupInfo.yac;
        }
        paramString = bZ(str, true);
        if (paramString == null)
        {
          bool = false;
          if (bool)
          {
            b("event_update_group", 0, bo.dpG().toString());
            anF("delete_group");
          }
          AppMethodBeat.o(62740);
          return bool;
        }
        if (paramString != null)
        {
          if (paramString.field_type == EmojiGroupInfo.TYPE_CUSTOM)
            ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks refuse delete custom emoji");
        }
        else
        {
          paramString.field_lastUseTime = System.currentTimeMillis();
          paramString.field_recommand = 0;
          paramString.field_sync = 0;
          bool = a(paramString);
          continue;
        }
        paramString.field_flag |= 256;
        paramString.field_status = -1;
        paramString.field_sort = 1;
        paramString.field_recommand = 0;
        paramString.field_sync = 0;
        continue;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", "Delete By ProductId fail." + paramString.getMessage());
      }
      boolean bool = false;
    }
  }

  // ERROR //
  public final EmojiGroupInfo bZ(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 506
    //   3: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 47	com/tencent/mm/storage/emotion/a:bSd	Lcom/tencent/mm/sdk/e/e;
    //   10: ldc_w 508
    //   13: iconst_1
    //   14: anewarray 22	java/lang/String
    //   17: dup
    //   18: iconst_0
    //   19: aload_1
    //   20: aastore
    //   21: iconst_2
    //   22: invokeinterface 67 4 0
    //   27: astore_3
    //   28: aload_3
    //   29: ifnull +61 -> 90
    //   32: aload_3
    //   33: astore 4
    //   35: aload_3
    //   36: invokeinterface 73 1 0
    //   41: ifeq +49 -> 90
    //   44: aload_3
    //   45: astore 4
    //   47: new 24	com/tencent/mm/storage/emotion/EmojiGroupInfo
    //   50: astore 5
    //   52: aload_3
    //   53: astore 4
    //   55: aload 5
    //   57: invokespecial 279	com/tencent/mm/storage/emotion/EmojiGroupInfo:<init>	()V
    //   60: aload_3
    //   61: astore 4
    //   63: aload 5
    //   65: aload_3
    //   66: invokevirtual 511	com/tencent/mm/storage/emotion/EmojiGroupInfo:d	(Landroid/database/Cursor;)V
    //   69: aload_3
    //   70: ifnull +9 -> 79
    //   73: aload_3
    //   74: invokeinterface 80 1 0
    //   79: ldc_w 506
    //   82: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: aload 5
    //   87: astore_1
    //   88: aload_1
    //   89: areturn
    //   90: aload_3
    //   91: ifnull +195 -> 286
    //   94: aload_3
    //   95: invokeinterface 80 1 0
    //   100: aconst_null
    //   101: astore_1
    //   102: aload_1
    //   103: ifnonnull +136 -> 239
    //   106: iload_2
    //   107: ifeq +115 -> 222
    //   110: ldc_w 506
    //   113: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   116: aconst_null
    //   117: astore_1
    //   118: goto -30 -> 88
    //   121: astore 6
    //   123: aconst_null
    //   124: astore 5
    //   126: aconst_null
    //   127: astore_3
    //   128: aload 5
    //   130: astore 4
    //   132: new 111	java/lang/StringBuilder
    //   135: astore 7
    //   137: aload 5
    //   139: astore 4
    //   141: aload 7
    //   143: ldc_w 513
    //   146: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   149: aload 5
    //   151: astore 4
    //   153: ldc 82
    //   155: aload 7
    //   157: aload_1
    //   158: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: ldc_w 515
    //   164: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: aload 6
    //   169: invokevirtual 120	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   172: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: aload 5
    //   183: ifnull +98 -> 281
    //   186: aload 5
    //   188: invokeinterface 80 1 0
    //   193: aload_3
    //   194: astore_1
    //   195: goto -93 -> 102
    //   198: astore_1
    //   199: aconst_null
    //   200: astore 4
    //   202: aload 4
    //   204: ifnull +10 -> 214
    //   207: aload 4
    //   209: invokeinterface 80 1 0
    //   214: ldc_w 506
    //   217: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: aload_1
    //   221: athrow
    //   222: new 24	com/tencent/mm/storage/emotion/EmojiGroupInfo
    //   225: dup
    //   226: invokespecial 279	com/tencent/mm/storage/emotion/EmojiGroupInfo:<init>	()V
    //   229: astore_1
    //   230: ldc_w 506
    //   233: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: goto -148 -> 88
    //   239: ldc_w 506
    //   242: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   245: goto -157 -> 88
    //   248: astore_1
    //   249: goto -47 -> 202
    //   252: astore 6
    //   254: aconst_null
    //   255: astore 4
    //   257: aload_3
    //   258: astore 5
    //   260: aload 4
    //   262: astore_3
    //   263: goto -135 -> 128
    //   266: astore 6
    //   268: aload 5
    //   270: astore 4
    //   272: aload_3
    //   273: astore 5
    //   275: aload 4
    //   277: astore_3
    //   278: goto -150 -> 128
    //   281: aload_3
    //   282: astore_1
    //   283: goto -181 -> 102
    //   286: aconst_null
    //   287: astore_1
    //   288: goto -186 -> 102
    //
    // Exception table:
    //   from	to	target	type
    //   6	28	121	java/lang/Exception
    //   6	28	198	finally
    //   35	44	248	finally
    //   47	52	248	finally
    //   55	60	248	finally
    //   63	69	248	finally
    //   132	137	248	finally
    //   141	149	248	finally
    //   153	181	248	finally
    //   35	44	252	java/lang/Exception
    //   47	52	252	java/lang/Exception
    //   55	60	252	java/lang/Exception
    //   63	69	266	java/lang/Exception
  }

  public final boolean c(EmojiGroupInfo paramEmojiGroupInfo)
  {
    boolean bool = false;
    AppMethodBeat.i(62738);
    if (paramEmojiGroupInfo == null)
    {
      ab.f("MicroMsg.emoji.EmojiGroupInfoStorage", "insert assertion!,invalid emojigroup info.");
      AppMethodBeat.o(62738);
    }
    while (true)
    {
      return bool;
      paramEmojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
      paramEmojiGroupInfo.field_sort = 1;
      ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks insert: packname: %s, lasttime: %d", new Object[] { paramEmojiGroupInfo.field_packName, Long.valueOf(paramEmojiGroupInfo.field_lastUseTime) });
      paramEmojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
      d(paramEmojiGroupInfo);
      bool = a(paramEmojiGroupInfo);
      if (bool)
        b("event_update_group", 0, bo.dpG().toString());
      AppMethodBeat.o(62738);
    }
  }

  public final HashMap<String, EmojiGroupInfo> duA()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(62732);
    HashMap localHashMap = new HashMap();
    Object localObject4 = "select * from EmojiGroupInfo where " + duH() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.bSd.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject2 = localObject4;
        localObject1 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject2 = localObject4;
            localObject1 = localObject4;
            localObject5 = new com/tencent/mm/storage/emotion/EmojiGroupInfo;
            localObject2 = localObject4;
            localObject1 = localObject4;
            ((EmojiGroupInfo)localObject5).<init>();
            localObject2 = localObject4;
            localObject1 = localObject4;
            ((EmojiGroupInfo)localObject5).d((Cursor)localObject4);
            localObject2 = localObject4;
            localObject1 = localObject4;
            localHashMap.put(((EmojiGroupInfo)localObject5).field_productID, localObject5);
            localObject2 = localObject4;
            localObject1 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          }
          while (bool);
        }
      }
      if (localObject4 != null)
        ((Cursor)localObject4).close();
      AppMethodBeat.o(62732);
      return localHashMap;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        Object localObject5 = new java/lang/StringBuilder;
        localObject1 = localObject2;
        ((StringBuilder)localObject5).<init>("get all group fail.");
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", localException.getMessage());
        if (localObject2 != null)
          localObject2.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62732);
    }
  }

  public final ArrayList<EmojiGroupInfo> duB()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(62733);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + duI() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.bSd.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject2 = localObject4;
        localObject1 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject2 = localObject4;
            localObject1 = localObject4;
            EmojiGroupInfo localEmojiGroupInfo = new com/tencent/mm/storage/emotion/EmojiGroupInfo;
            localObject2 = localObject4;
            localObject1 = localObject4;
            localEmojiGroupInfo.<init>();
            localObject2 = localObject4;
            localObject1 = localObject4;
            localEmojiGroupInfo.d((Cursor)localObject4);
            localObject2 = localObject4;
            localObject1 = localObject4;
            localArrayList.add(localEmojiGroupInfo);
            localObject2 = localObject4;
            localObject1 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          }
          while (bool);
        }
      }
      if (localObject4 != null)
        ((Cursor)localObject4).close();
      AppMethodBeat.o(62733);
      return localArrayList;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        localObject4 = new java/lang/StringBuilder;
        localObject1 = localObject2;
        ((StringBuilder)localObject4).<init>("get all group fail.");
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", localException.getMessage());
        if (localObject2 != null)
          localObject2.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62733);
    }
  }

  public final int duC()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 0;
    int j = 0;
    AppMethodBeat.i(62734);
    Object localObject4 = "select count(*) from EmojiGroupInfo where " + duI() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.bSd.a((String)localObject4, null, 2);
      int k = j;
      if (localObject4 != null)
      {
        k = j;
        localObject2 = localObject4;
        localObject1 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          localObject2 = localObject4;
          localObject1 = localObject4;
          k = ((Cursor)localObject4).getInt(0);
        }
      }
      j = k;
      if (localObject4 != null)
      {
        ((Cursor)localObject4).close();
        j = k;
      }
      AppMethodBeat.o(62734);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localObject1 = localObject2;
        localStringBuilder.<init>("getDownloadGroupListCount fail.");
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", localException.getMessage());
        j = i;
        if (localObject2 != null)
        {
          localObject2.close();
          j = i;
        }
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62734);
    }
  }

  public final HashMap<String, ar> duD()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(62735);
    HashMap localHashMap = new HashMap();
    Object localObject4 = "select * from EmojiGroupInfo where " + duI() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.bSd.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject2 = localObject4;
        localObject1 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          localObject2 = localObject4;
          localObject1 = localObject4;
          ar localar = new com/tencent/mm/storage/ar;
          localObject2 = localObject4;
          localObject1 = localObject4;
          localar.<init>();
          localObject2 = localObject4;
          localObject1 = localObject4;
          int i = ((Cursor)localObject4).getColumnIndex("productID");
          localObject2 = localObject4;
          localObject1 = localObject4;
          int j = ((Cursor)localObject4).getColumnIndex("packName");
          boolean bool;
          do
          {
            localObject2 = localObject4;
            localObject1 = localObject4;
            String str = ((Cursor)localObject4).getString(i);
            localObject2 = localObject4;
            localObject1 = localObject4;
            localar.cwg = str;
            localObject2 = localObject4;
            localObject1 = localObject4;
            localar.lcC = ((Cursor)localObject4).getString(j);
            localObject2 = localObject4;
            localObject1 = localObject4;
            localar.Mo(7);
            localObject2 = localObject4;
            localObject1 = localObject4;
            localHashMap.put(str, localar);
            localObject2 = localObject4;
            localObject1 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          }
          while (bool);
        }
      }
      if (localObject4 != null)
        ((Cursor)localObject4).close();
      AppMethodBeat.o(62735);
      return localHashMap;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        localObject4 = new java/lang/StringBuilder;
        localObject1 = localObject2;
        ((StringBuilder)localObject4).<init>("get download group map failed.");
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", localException.getMessage());
        if (localObject2 != null)
          localObject2.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62735);
    }
  }

  public final boolean duF()
  {
    boolean bool = true;
    AppMethodBeat.i(62742);
    String str = EmojiGroupInfo.xZZ;
    if (this.bSd.delete("EmojiGroupInfo", "recommand=? and type!=? and status!=?", new String[] { "1", str, "7" }) > 0)
      AppMethodBeat.o(62742);
    while (true)
    {
      return bool;
      AppMethodBeat.o(62742);
      bool = false;
    }
  }

  public final ArrayList<EmojiGroupInfo> duG()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(62744);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + duI() + " or " + Mu(EmojiGroupInfo.TYPE_SYSTEM) + " or " + Mu(EmojiGroupInfo.TYPE_CUSTOM) + " or  ( recommand = '1' ) " + " order by sort ASC,idx ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.bSd.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject2 = localObject4;
        localObject1 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject2 = localObject4;
            localObject1 = localObject4;
            localObject5 = new com/tencent/mm/storage/emotion/EmojiGroupInfo;
            localObject2 = localObject4;
            localObject1 = localObject4;
            ((EmojiGroupInfo)localObject5).<init>();
            localObject2 = localObject4;
            localObject1 = localObject4;
            ((EmojiGroupInfo)localObject5).d((Cursor)localObject4);
            localObject2 = localObject4;
            localObject1 = localObject4;
            localArrayList.add(localObject5);
            localObject2 = localObject4;
            localObject1 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          }
          while (bool);
        }
      }
      if (localObject4 != null)
        ((Cursor)localObject4).close();
      AppMethodBeat.o(62744);
      return localArrayList;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        Object localObject5 = new java/lang/StringBuilder;
        localObject1 = localObject2;
        ((StringBuilder)localObject5).<init>("get Panel EmojiGroupInfo.");
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", localException.getMessage());
        if (localObject2 != null)
          localObject2.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62744);
    }
  }

  // ERROR //
  public final boolean duJ()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc_w 610
    //   5: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 111	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   15: getstatic 190	com/tencent/mm/storage/emotion/EmojiGroupInfo:TYPE_SYSTEM	I
    //   18: invokevirtual 138	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   21: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: astore_2
    //   25: new 111	java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   32: getstatic 198	com/tencent/mm/storage/emotion/EmojiGroupInfo:xZZ	I
    //   35: invokevirtual 138	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   38: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: astore_3
    //   42: ldc 82
    //   44: ldc_w 612
    //   47: iconst_1
    //   48: anewarray 86	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: ldc_w 614
    //   56: aastore
    //   57: invokestatic 405	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   60: aconst_null
    //   61: astore 4
    //   63: aload_0
    //   64: getfield 47	com/tencent/mm/storage/emotion/a:bSd	Lcom/tencent/mm/sdk/e/e;
    //   67: ldc_w 614
    //   70: iconst_4
    //   71: anewarray 22	java/lang/String
    //   74: dup
    //   75: iconst_0
    //   76: aload_2
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: aload_3
    //   81: aastore
    //   82: dup
    //   83: iconst_2
    //   84: ldc 62
    //   86: aastore
    //   87: dup
    //   88: iconst_3
    //   89: ldc_w 594
    //   92: aastore
    //   93: iconst_2
    //   94: invokeinterface 67 4 0
    //   99: astore_3
    //   100: aload_3
    //   101: ifnull +37 -> 138
    //   104: aload_3
    //   105: astore 4
    //   107: aload_3
    //   108: invokeinterface 73 1 0
    //   113: istore 5
    //   115: iload 5
    //   117: ifeq +21 -> 138
    //   120: aload_3
    //   121: ifnull +9 -> 130
    //   124: aload_3
    //   125: invokeinterface 80 1 0
    //   130: ldc_w 610
    //   133: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: iload_1
    //   137: ireturn
    //   138: aload_3
    //   139: ifnull +9 -> 148
    //   142: aload_3
    //   143: invokeinterface 80 1 0
    //   148: ldc_w 610
    //   151: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: iconst_0
    //   155: istore_1
    //   156: goto -20 -> 136
    //   159: astore 4
    //   161: aconst_null
    //   162: astore 4
    //   164: ldc 82
    //   166: ldc_w 616
    //   169: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: aload 4
    //   174: ifnull -26 -> 148
    //   177: aload 4
    //   179: invokeinterface 80 1 0
    //   184: goto -36 -> 148
    //   187: astore_3
    //   188: aload 4
    //   190: ifnull +10 -> 200
    //   193: aload 4
    //   195: invokeinterface 80 1 0
    //   200: ldc_w 610
    //   203: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: aload_3
    //   207: athrow
    //   208: astore_3
    //   209: goto -21 -> 188
    //   212: astore 4
    //   214: aload_3
    //   215: astore 4
    //   217: goto -53 -> 164
    //
    // Exception table:
    //   from	to	target	type
    //   63	100	159	java/lang/Exception
    //   63	100	187	finally
    //   107	115	187	finally
    //   164	172	208	finally
    //   107	115	212	java/lang/Exception
  }

  public final List<String> duK()
  {
    AppMethodBeat.i(62750);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = EmojiGroupInfo.xZZ;
    Object localObject2 = null;
    Object localObject4 = null;
    try
    {
      localObject1 = this.bSd.a("select productID from EmojiGroupInfo where type=? and sync=?", new String[] { localObject1, "1" }, 2);
      if (localObject1 != null)
      {
        localObject4 = localObject1;
        localObject2 = localObject1;
        if (((Cursor)localObject1).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject4 = localObject1;
            localObject2 = localObject1;
            localArrayList.add(((Cursor)localObject1).getString(0));
            localObject4 = localObject1;
            localObject2 = localObject1;
            bool = ((Cursor)localObject1).moveToNext();
          }
          while (bool);
        }
      }
      if (localObject1 != null)
        ((Cursor)localObject1).close();
      AppMethodBeat.o(62750);
      return localArrayList;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject3 = localObject4;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", "getNeedToSyncStoreEmojiProductList. exception.%s", new Object[] { bo.dpG() });
        if (localObject4 != null)
          localObject4.close();
      }
    }
    finally
    {
      Object localObject3;
      if (localObject3 != null)
        localObject3.close();
      AppMethodBeat.o(62750);
    }
  }

  public final List<String> duL()
  {
    AppMethodBeat.i(62751);
    ArrayList localArrayList = new ArrayList();
    String str = EmojiGroupInfo.xZZ;
    Object localObject1 = EmojiGroupInfo.TYPE_SYSTEM;
    Object localObject2 = null;
    Object localObject4 = null;
    try
    {
      localObject1 = this.bSd.a("select productID from EmojiGroupInfo where sync=? and (type=?  and status=?) or (type=? and flag=?)", new String[] { "0", str, "7", localObject1, "0" }, 2);
      if (localObject1 != null)
      {
        localObject4 = localObject1;
        localObject2 = localObject1;
        if (((Cursor)localObject1).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject4 = localObject1;
            localObject2 = localObject1;
            localArrayList.add(((Cursor)localObject1).getString(0));
            localObject4 = localObject1;
            localObject2 = localObject1;
            bool = ((Cursor)localObject1).moveToNext();
          }
          while (bool);
        }
      }
      if (localObject1 != null)
        ((Cursor)localObject1).close();
      AppMethodBeat.o(62751);
      return localArrayList;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject3 = localObject4;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", "getNeedToUploadStoreEmojiProductList. exception.%s", new Object[] { bo.dpG() });
        if (localObject4 != null)
          localObject4.close();
      }
    }
    finally
    {
      Object localObject3;
      if (localObject3 != null)
        localObject3.close();
      AppMethodBeat.o(62751);
    }
  }

  public final ArrayList<EmojiGroupInfo> duM()
  {
    AppMethodBeat.i(62752);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = EmojiGroupInfo.xZZ;
    Object localObject2 = EmojiGroupInfo.TYPE_SYSTEM;
    Object localObject3 = null;
    Object localObject4 = null;
    try
    {
      localObject2 = this.bSd.a("select * from EmojiGroupInfo where  (type=?  and status=?) or (type=? and flag=?)  order by sort ASC,idx ASC,lastUseTime DESC", new String[] { localObject1, "7", localObject2, "0" }, 2);
      localObject4 = localObject2;
      localObject3 = localObject2;
      ab.v("MicroMsg.emoji.EmojiGroupInfoStorage", "getNewMineGroupList : ===========");
      if (localObject2 != null)
      {
        localObject4 = localObject2;
        localObject3 = localObject2;
        if (((Cursor)localObject2).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject4 = localObject2;
            localObject3 = localObject2;
            localObject1 = new com/tencent/mm/storage/emotion/EmojiGroupInfo;
            localObject4 = localObject2;
            localObject3 = localObject2;
            ((EmojiGroupInfo)localObject1).<init>();
            localObject4 = localObject2;
            localObject3 = localObject2;
            ((EmojiGroupInfo)localObject1).d((Cursor)localObject2);
            localObject4 = localObject2;
            localObject3 = localObject2;
            localArrayList.add(localObject1);
            localObject4 = localObject2;
            localObject3 = localObject2;
            bool = ((Cursor)localObject2).moveToNext();
          }
          while (bool);
        }
      }
      if (localObject2 != null)
        ((Cursor)localObject2).close();
      AppMethodBeat.o(62752);
      return localArrayList;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject3 = localObject4;
        localObject1 = new java/lang/StringBuilder;
        localObject3 = localObject4;
        ((StringBuilder)localObject1).<init>("get Panel EmojiGroupInfo.");
        localObject3 = localObject4;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", localException.getMessage());
        if (localObject4 != null)
          localObject4.close();
      }
    }
    finally
    {
      if (localObject3 != null)
        localObject3.close();
      AppMethodBeat.o(62752);
    }
  }

  public final void duN()
  {
    AppMethodBeat.i(62753);
    ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "recover heart begin");
    EmojiGroupInfo localEmojiGroupInfo = bZ(String.valueOf(EmojiGroupInfo.yad), false);
    if (localEmojiGroupInfo == null)
      localEmojiGroupInfo = new EmojiGroupInfo();
    while (true)
    {
      localEmojiGroupInfo.field_productID = String.valueOf(EmojiGroupInfo.yad);
      localEmojiGroupInfo.field_packName = "emoji_custom_group";
      localEmojiGroupInfo.field_type = EmojiGroupInfo.TYPE_CUSTOM;
      localEmojiGroupInfo.field_status = 0;
      localEmojiGroupInfo.field_packStatus = 1;
      localEmojiGroupInfo.field_flag = 0;
      a(localEmojiGroupInfo);
      ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "recover heart end");
      AppMethodBeat.o(62753);
      return;
      ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "EmojiGroupInfo:%s", new Object[] { localEmojiGroupInfo.toString() });
    }
  }

  public final boolean duO()
  {
    AppMethodBeat.i(62754);
    h localh = null;
    if ((this.bSd instanceof h))
      localh = (h)this.bSd;
    for (long l = localh.iV(Thread.currentThread().getId()); ; l = -1L)
    {
      Object localObject = duB();
      if (!((ArrayList)localObject).isEmpty())
      {
        Iterator localIterator = ((ArrayList)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (EmojiGroupInfo)localIterator.next();
          if ((localObject != null) && (!bo.isNullOrNil(((EmojiGroupInfo)localObject).field_productID)))
          {
            i = Jp(((EmojiGroupInfo)localObject).field_productID);
            if (((EmojiGroupInfo)localObject).field_count != i)
            {
              ((EmojiGroupInfo)localObject).field_count = i;
              this.bSd.update("EmojiGroupInfo", ((EmojiGroupInfo)localObject).Hl(), "productID=?", new String[] { ((EmojiGroupInfo)localObject).field_productID });
            }
          }
        }
      }
      if (localh != null);
      for (int i = localh.mB(l); ; i = -1)
      {
        b("event_update_group", 0, bo.dpG().toString());
        if (i >= 0)
          AppMethodBeat.o(62754);
        for (boolean bool = true; ; bool = false)
        {
          return bool;
          AppMethodBeat.o(62754);
        }
      }
    }
  }

  public final boolean duy()
  {
    boolean bool = true;
    AppMethodBeat.i(62730);
    EmojiGroupInfo localEmojiGroupInfo = null;
    Cursor localCursor1 = null;
    Cursor localCursor2 = localCursor1;
    Object localObject2 = localEmojiGroupInfo;
    try
    {
      com.tencent.mm.sdk.e.e locale = this.bSd;
      localCursor2 = localCursor1;
      localObject2 = localEmojiGroupInfo;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localCursor2 = localCursor1;
      localObject2 = localEmojiGroupInfo;
      localStringBuilder.<init>();
      localCursor2 = localCursor1;
      localObject2 = localEmojiGroupInfo;
      localCursor1 = locale.a("select * from EmojiGroupInfo where type=?", new String[] { EmojiGroupInfo.TYPE_SYSTEM }, 2);
      int i;
      if (localCursor1 != null)
      {
        localCursor2 = localCursor1;
        localObject2 = localCursor1;
        if (localCursor1.moveToFirst())
        {
          localCursor2 = localCursor1;
          localObject2 = localCursor1;
          localEmojiGroupInfo = new com/tencent/mm/storage/emotion/EmojiGroupInfo;
          localCursor2 = localCursor1;
          localObject2 = localCursor1;
          localEmojiGroupInfo.<init>();
          localCursor2 = localCursor1;
          localObject2 = localCursor1;
          localEmojiGroupInfo.d(localCursor1);
          localCursor2 = localCursor1;
          localObject2 = localCursor1;
          i = localEmojiGroupInfo.field_flag;
          if ((i & 0x100) > 0)
          {
            i = 1;
            if (i != 0)
              break label185;
            label161: if (localCursor1 != null)
              localCursor1.close();
            AppMethodBeat.o(62730);
          }
        }
      }
      while (true)
      {
        return bool;
        i = 0;
        break;
        label185: bool = false;
        break label161;
        if (localCursor1 != null)
          localCursor1.close();
        AppMethodBeat.o(62730);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject2 = localCursor2;
        ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", localException.toString());
        if (localCursor2 != null)
          localCursor2.close();
      }
    }
    finally
    {
      if (localObject2 != null)
        ((Cursor)localObject2).close();
      AppMethodBeat.o(62730);
    }
  }

  public final List<EmojiGroupInfo> duz()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(62731);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + duH() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.bSd.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject2 = localObject4;
        localObject1 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject2 = localObject4;
            localObject1 = localObject4;
            localObject5 = new com/tencent/mm/storage/emotion/EmojiGroupInfo;
            localObject2 = localObject4;
            localObject1 = localObject4;
            ((EmojiGroupInfo)localObject5).<init>();
            localObject2 = localObject4;
            localObject1 = localObject4;
            ((EmojiGroupInfo)localObject5).d((Cursor)localObject4);
            localObject2 = localObject4;
            localObject1 = localObject4;
            localArrayList.add(localObject5);
            localObject2 = localObject4;
            localObject1 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          }
          while (bool);
        }
      }
      if (localObject4 != null)
        ((Cursor)localObject4).close();
      AppMethodBeat.o(62731);
      return localArrayList;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        Object localObject5 = new java/lang/StringBuilder;
        localObject1 = localObject2;
        ((StringBuilder)localObject5).<init>("get all group fail.");
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", localException.getMessage());
        if (localObject2 != null)
          localObject2.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62731);
    }
  }

  public final boolean eI(List<EmojiGroupInfo> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(62739);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "updateList . list is null.");
      AppMethodBeat.o(62739);
      return bool;
    }
    h localh = null;
    long l;
    if ((this.bSd instanceof h))
    {
      localh = (h)this.bSd;
      l = localh.iV(Thread.currentThread().getId());
      ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround updateList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    while (true)
    {
      for (int i = 0; i < paramList.size(); i++)
      {
        EmojiGroupInfo localEmojiGroupInfo = (EmojiGroupInfo)paramList.get(i);
        ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks packname: productid: %s, lasttime: %d, sort: %d", new Object[] { localEmojiGroupInfo.field_productID, Long.valueOf(localEmojiGroupInfo.field_lastUseTime), Integer.valueOf(localEmojiGroupInfo.field_sort) });
        a(localEmojiGroupInfo);
      }
      if (localh != null)
      {
        localh.mB(l);
        ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end updateList transaction");
      }
      b("event_update_group", 0, bo.dpG().toString());
      AppMethodBeat.o(62739);
      bool = true;
      break;
      l = -1L;
    }
  }

  public final String getTableName()
  {
    return "EmojiGroupInfo";
  }

  public final boolean hi(Context paramContext)
  {
    AppMethodBeat.i(62726);
    ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init start.");
    hj(paramContext);
    ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init end.");
    AppMethodBeat.o(62726);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.a
 * JD-Core Version:    0.6.2
 */