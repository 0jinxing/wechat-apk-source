package com.tencent.mm.plugin.game.commlib;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.game.d.ac;
import com.tencent.mm.plugin.game.d.ak;
import com.tencent.mm.plugin.game.d.ay;
import com.tencent.mm.plugin.game.d.cu;
import com.tencent.mm.plugin.game.d.dd;
import com.tencent.mm.plugin.game.d.dm;
import com.tencent.mm.plugin.game.d.do;
import com.tencent.mm.plugin.game.d.dp;
import com.tencent.mm.plugin.game.d.m;
import com.tencent.mm.plugin.game.d.r;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static final String mTq;
  public static final String mTr;
  private static ay mTs;

  static
  {
    AppMethodBeat.i(116984);
    mTq = b.eSj + "game/";
    mTr = mTq + "globalconfig";
    AppMethodBeat.o(116984);
  }

  // ERROR //
  public static void a(ay paramay)
  {
    // Byte code:
    //   0: ldc 53
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: putstatic 55	com/tencent/mm/plugin/game/commlib/a:mTs	Lcom/tencent/mm/plugin/game/d/ay;
    //   9: aload_0
    //   10: getfield 61	com/tencent/mm/plugin/game/d/ay:nbD	Lcom/tencent/mm/plugin/game/d/s;
    //   13: ifnull +27 -> 40
    //   16: invokestatic 67	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   19: invokevirtual 73	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   22: getstatic 79	com/tencent/mm/storage/ac$a:xVR	Lcom/tencent/mm/storage/ac$a;
    //   25: getstatic 55	com/tencent/mm/plugin/game/commlib/a:mTs	Lcom/tencent/mm/plugin/game/d/ay;
    //   28: getfield 61	com/tencent/mm/plugin/game/d/ay:nbD	Lcom/tencent/mm/plugin/game/d/s;
    //   31: getfield 85	com/tencent/mm/plugin/game/d/s:nal	Z
    //   34: invokestatic 91	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   37: invokevirtual 97	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   40: new 99	java/io/File
    //   43: dup
    //   44: getstatic 40	com/tencent/mm/plugin/game/commlib/a:mTq	Ljava/lang/String;
    //   47: invokespecial 102	java/io/File:<init>	(Ljava/lang/String;)V
    //   50: astore_1
    //   51: aload_1
    //   52: invokevirtual 106	java/io/File:exists	()Z
    //   55: ifeq +10 -> 65
    //   58: aload_1
    //   59: invokevirtual 109	java/io/File:isDirectory	()Z
    //   62: ifne +8 -> 70
    //   65: aload_1
    //   66: invokevirtual 112	java/io/File:mkdirs	()Z
    //   69: pop
    //   70: aload_0
    //   71: invokevirtual 116	com/tencent/mm/plugin/game/d/ay:toByteArray	()[B
    //   74: astore_1
    //   75: new 118	java/io/FileOutputStream
    //   78: astore_0
    //   79: aload_0
    //   80: getstatic 44	com/tencent/mm/plugin/game/commlib/a:mTr	Ljava/lang/String;
    //   83: invokespecial 119	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   86: aload_0
    //   87: aload_1
    //   88: invokevirtual 123	java/io/FileOutputStream:write	([B)V
    //   91: aload_0
    //   92: ifnull +7 -> 99
    //   95: aload_0
    //   96: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   99: invokestatic 131	com/tencent/mm/plugin/game/commlib/e:bDo	()V
    //   102: ldc 53
    //   104: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: return
    //   108: astore_1
    //   109: aconst_null
    //   110: astore_0
    //   111: ldc 133
    //   113: new 20	java/lang/StringBuilder
    //   116: dup
    //   117: ldc 135
    //   119: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: aload_1
    //   123: invokevirtual 139	java/io/IOException:getMessage	()Ljava/lang/String;
    //   126: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   135: goto -44 -> 91
    //   138: astore_0
    //   139: goto -40 -> 99
    //   142: astore_1
    //   143: goto -32 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   70	86	108	java/io/IOException
    //   95	99	138	java/io/IOException
    //   86	91	142	java/io/IOException
  }

  // ERROR //
  public static void bDc()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 149
    //   5: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 55	com/tencent/mm/plugin/game/commlib/a:mTs	Lcom/tencent/mm/plugin/game/d/ay;
    //   11: ifnull +12 -> 23
    //   14: ldc 149
    //   16: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: ldc 2
    //   21: monitorexit
    //   22: return
    //   23: invokestatic 155	java/lang/System:currentTimeMillis	()J
    //   26: lstore_0
    //   27: new 99	java/io/File
    //   30: astore_2
    //   31: aload_2
    //   32: getstatic 44	com/tencent/mm/plugin/game/commlib/a:mTr	Ljava/lang/String;
    //   35: invokespecial 102	java/io/File:<init>	(Ljava/lang/String;)V
    //   38: new 157	java/io/FileInputStream
    //   41: astore_3
    //   42: aload_3
    //   43: aload_2
    //   44: invokespecial 160	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   47: aload_2
    //   48: invokevirtual 163	java/io/File:length	()J
    //   51: l2i
    //   52: newarray byte
    //   54: astore 4
    //   56: aload_3
    //   57: aload 4
    //   59: invokevirtual 167	java/io/FileInputStream:read	([B)I
    //   62: pop
    //   63: new 57	com/tencent/mm/plugin/game/d/ay
    //   66: astore_2
    //   67: aload_2
    //   68: invokespecial 168	com/tencent/mm/plugin/game/d/ay:<init>	()V
    //   71: aload_2
    //   72: putstatic 55	com/tencent/mm/plugin/game/commlib/a:mTs	Lcom/tencent/mm/plugin/game/d/ay;
    //   75: aload_2
    //   76: aload 4
    //   78: invokevirtual 172	com/tencent/mm/plugin/game/d/ay:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   81: pop
    //   82: aload_3
    //   83: ifnull +7 -> 90
    //   86: aload_3
    //   87: invokevirtual 173	java/io/FileInputStream:close	()V
    //   90: new 20	java/lang/StringBuilder
    //   93: astore_3
    //   94: aload_3
    //   95: ldc 175
    //   97: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   100: ldc 133
    //   102: aload_3
    //   103: invokestatic 155	java/lang/System:currentTimeMillis	()J
    //   106: lload_0
    //   107: lsub
    //   108: invokevirtual 178	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   111: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 180	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: ldc 149
    //   119: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: goto -103 -> 19
    //   125: astore_3
    //   126: ldc 2
    //   128: monitorexit
    //   129: aload_3
    //   130: athrow
    //   131: astore_2
    //   132: aconst_null
    //   133: astore_3
    //   134: new 20	java/lang/StringBuilder
    //   137: astore 4
    //   139: aload 4
    //   141: ldc 182
    //   143: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   146: ldc 133
    //   148: aload 4
    //   150: aload_2
    //   151: invokevirtual 183	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   154: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: goto -81 -> 82
    //   166: astore_3
    //   167: goto -77 -> 90
    //   170: astore_2
    //   171: goto -37 -> 134
    //
    // Exception table:
    //   from	to	target	type
    //   3	19	125	finally
    //   23	27	125	finally
    //   27	47	125	finally
    //   47	82	125	finally
    //   86	90	125	finally
    //   90	122	125	finally
    //   134	163	125	finally
    //   27	47	131	java/lang/Exception
    //   86	90	166	java/io/IOException
    //   47	82	170	java/lang/Exception
  }

  public static boolean bDd()
  {
    AppMethodBeat.i(116974);
    boolean bool;
    if (mTs != null)
    {
      bool = mTs.nbv;
      ab.i("MicroMsg.GameConfigManager", "getShowEntrance : ".concat(String.valueOf(bool)));
      AppMethodBeat.o(116974);
      return bool;
    }
    bDc();
    Object localObject = ah.getContext().getSharedPreferences(ah.doA(), 0);
    ah.getContext();
    localObject = aa.g((SharedPreferences)localObject);
    ab.i("MicroMsg.GameConfigManager", "getShowEntrance, lang = %s", new Object[] { localObject });
    if ("zh_CN".equals(localObject));
    for (localObject = "0"; ; localObject = "1")
    {
      localObject = bo.bc(g.Nu().getValue("HideGameCenter"), (String)localObject);
      ab.i("MicroMsg.GameConfigManager", "hide game center:[%s]", new Object[] { localObject });
      bool = ((String)localObject).equalsIgnoreCase("0");
      break;
    }
  }

  public static ak bDe()
  {
    AppMethodBeat.i(116975);
    Object localObject = null;
    if (mTs != null)
    {
      ak localak = mTs.nbw;
      localObject = localak;
      if (localak != null)
      {
        ab.i("MicroMsg.GameConfigManager", "getGameIndexSettingControl jumpType:%d, jumpUrl:%s", new Object[] { Integer.valueOf(localak.naz), localak.mZj });
        localObject = localak;
      }
    }
    while (true)
    {
      AppMethodBeat.o(116975);
      return localObject;
      bDc();
    }
  }

  public static ac bDf()
  {
    AppMethodBeat.i(116976);
    Object localObject = null;
    if (mTs != null)
    {
      ac localac = mTs.nby;
      localObject = localac;
      if (localac != null)
      {
        ab.i("MicroMsg.GameConfigManager", "getGameDetailSettingControl jumpType:%d, jumpUrl:%s", new Object[] { Integer.valueOf(localac.naz), localac.mZj });
        localObject = localac;
      }
    }
    while (true)
    {
      AppMethodBeat.o(116976);
      return localObject;
      bDc();
    }
  }

  public static dd bDg()
  {
    AppMethodBeat.i(116977);
    dd localdd;
    if (mTs != null)
    {
      localdd = mTs.nbA;
      AppMethodBeat.o(116977);
    }
    while (true)
    {
      return localdd;
      bDc();
      localdd = null;
      AppMethodBeat.o(116977);
    }
  }

  public static boolean bDh()
  {
    AppMethodBeat.i(116978);
    boolean bool;
    if (mTs != null)
    {
      if (mTs.nbC == null)
        break label42;
      bool = mTs.nbC.ndK;
      AppMethodBeat.o(116978);
    }
    while (true)
    {
      return bool;
      bDc();
      label42: bool = false;
      AppMethodBeat.o(116978);
    }
  }

  public static String bDi()
  {
    AppMethodBeat.i(116979);
    String str;
    if (mTs != null)
    {
      if (mTs.nbB == null)
        break label42;
      str = mTs.nbB.mZV;
      AppMethodBeat.o(116979);
    }
    while (true)
    {
      return str;
      bDc();
      label42: str = null;
      AppMethodBeat.o(116979);
    }
  }

  public static List<String> bDj()
  {
    AppMethodBeat.i(116980);
    ArrayList localArrayList;
    if (mTs != null)
    {
      if (mTs.nbC == null)
        break label111;
      Object localObject = mTs.nbC.ndL;
      if (bo.ek((List)localObject))
        break label111;
      localArrayList = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        cu localcu = (cu)((Iterator)localObject).next();
        if ((localcu != null) && (!bo.isNullOrNil(localcu.mZV)))
          localArrayList.add(localcu.mZV);
      }
      AppMethodBeat.o(116980);
    }
    while (true)
    {
      return localArrayList;
      bDc();
      label111: localArrayList = null;
      AppMethodBeat.o(116980);
    }
  }

  public static List<String> bDk()
  {
    AppMethodBeat.i(116981);
    ArrayList localArrayList;
    if (mTs != null)
    {
      if (mTs.nbC == null)
        break label111;
      Object localObject = mTs.nbC.ndM;
      if (bo.ek((List)localObject))
        break label111;
      localArrayList = new ArrayList();
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (cu)localIterator.next();
        if ((localObject != null) && (!bo.isNullOrNil(((cu)localObject).mZV)))
          localArrayList.add(((cu)localObject).mZV);
      }
      AppMethodBeat.o(116981);
    }
    while (true)
    {
      return localArrayList;
      bDc();
      label111: localArrayList = null;
      AppMethodBeat.o(116981);
    }
  }

  public static int bDl()
  {
    int i = 0;
    AppMethodBeat.i(116982);
    if (mTs != null)
      if (mTs.nbE != null)
      {
        i = mTs.nbE.ndJ;
        AppMethodBeat.o(116982);
      }
    while (true)
    {
      return i;
      AppMethodBeat.o(116982);
      continue;
      bDc();
      AppMethodBeat.o(116982);
    }
  }

  public static List<String> bDm()
  {
    AppMethodBeat.i(116983);
    ArrayList localArrayList;
    if (mTs != null)
    {
      if (mTs.nbF == null)
        break label111;
      Object localObject = mTs.nbF.nak;
      if (bo.ek((List)localObject))
        break label111;
      localArrayList = new ArrayList();
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (dm)localIterator.next();
        if ((localObject != null) && (!bo.isNullOrNil(((dm)localObject).ndI)))
          localArrayList.add(((dm)localObject).ndI);
      }
      AppMethodBeat.o(116983);
    }
    while (true)
    {
      return localArrayList;
      bDc();
      label111: localArrayList = null;
      AppMethodBeat.o(116983);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.commlib.a
 * JD-Core Version:    0.6.2
 */