package com.tencent.mm.plugin.ext.openapi.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fp;
import com.tencent.mm.g.a.fp.b;
import com.tencent.mm.g.a.sg;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.ext.b;
import com.tencent.mm.plugin.ext.c.b.b;
import com.tencent.mm.plugin.ext.c.e.2;
import com.tencent.mm.plugin.ext.c.e.a;
import com.tencent.mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.mm.plugin.ext.ui.RedirectToQrCodeStubUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.bz;
import com.tencent.mm.storage.ca;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExtControlProviderOpenApi extends ExtContentProviderBase
{
  public static boolean lPG = false;
  private static final String[] lPH = { "retCode", "selfId" };
  private static final String[] lPI = { "retCode", "sportConfig" };
  private static final String[] lPJ = { "openid", "avatar" };
  private static final String[] lPK = { "voiceType", "sampleRateInHz", "channelConfig", "audioFormat", "filePath" };
  private static final String[] lPL = { "ssid", "macAddress", "isSupportWechat", "name" };
  private static final String[] lPM = { "username", "appId", "versionType", "nickname", "shortNickname", "iconURL", "collection", "runningFlag", "wechatPkg", "action", "intentInfo" };
  private Context context;
  private ak handler;
  private String[] lPN = null;
  private int lPO = -1;

  public ExtControlProviderOpenApi()
  {
  }

  public ExtControlProviderOpenApi(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.lPN = paramArrayOfString;
    this.lPO = paramInt;
    this.context = paramContext;
  }

  private Cursor P(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(20320);
    ab.i("MicroMsg.ExtControlProviderOpenApi", "doRegisterMsgListener");
    if ((com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString1)) || (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString2)) || (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString3)))
    {
      ab.e("MicroMsg.ExtControlProviderOpenApi", "wrong args, scene = %s, msgType = %s, msgState = %s", new Object[] { paramString1, paramString2, paramString3 });
      dZ(3, 2004);
      paramString1 = com.tencent.mm.pluginsdk.d.a.a.Kn(2004);
      AppMethodBeat.o(20320);
    }
    while (true)
    {
      return paramString1;
      Object localObject = null;
      try
      {
        int i = Integer.parseInt(paramString3);
        int j = Integer.parseInt(paramString1);
        int k = Integer.parseInt(paramString2);
        if (i != 2)
        {
          ab.e("MicroMsg.ExtControlProviderOpenApi", "wrong msgState: ".concat(String.valueOf(i)));
          dZ(3, 2005);
          paramString1 = com.tencent.mm.pluginsdk.d.a.a.Kn(2005);
          AppMethodBeat.o(20320);
        }
        else if (b.brA().apN(this.lPW) == null)
        {
          paramString1 = new com/tencent/mm/storage/bo;
          paramString1.<init>();
          paramString1.field_appId = this.lPW;
          paramString1.field_packageName = brL();
          paramString2 = this.lPW;
          boolean bool;
          if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString2))
          {
            bool = false;
            label198: if (!bool)
              break label330;
          }
          label330: for (paramString1.field_status = 1; ; paramString1.field_status = 0)
          {
            paramString1.field_sceneFlag = j;
            paramString1.field_msgTypeFlag = k;
            paramString1.field_msgState = i;
            bool = b.brA().b(paramString1);
            ab.i("MicroMsg.ExtControlProviderOpenApi", "registerMsgReceiver ret = %s, pkgName = %s, scene = %s, msgType = %s, msgState = %s, appStatus = %s", new Object[] { Boolean.valueOf(bool), brL(), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(paramString1.field_status) });
            if (bool)
              break label416;
            paramString1 = com.tencent.mm.pluginsdk.d.a.a.Kn(2006);
            AppMethodBeat.o(20320);
            break;
            bool = com.tencent.mm.pluginsdk.model.app.g.k(com.tencent.mm.pluginsdk.model.app.g.bT(paramString2, true));
            break label198;
          }
        }
      }
      catch (Exception paramString2)
      {
        paramString1 = localObject;
      }
    }
    while (true)
      while (true)
      {
        T(1, 4, 12);
        ab.e("MicroMsg.ExtControlProviderOpenApi", "exception in doRegisterMsgListener, %s", new Object[] { paramString2.getMessage() });
        if (paramString1 != null)
          paramString1.close();
        paramString1 = com.tencent.mm.pluginsdk.d.a.a.Kn(12);
        AppMethodBeat.o(20320);
        break;
        ab.w("MicroMsg.ExtControlProviderOpenApi", "This app had already been registered, appId = %s, pkg = %s", new Object[] { this.lPW, brL() });
        label416: paramString1 = new java/lang/StringBuilder;
        paramString1.<init>();
        paramString1 = paramString1.append(r.Yz());
        aw.ZK();
        paramString2 = com.tencent.mm.sdk.platformtools.ag.ck(com.tencent.mm.model.c.QF());
        paramString1 = new MatrixCursor(lPH);
        try
        {
          paramString1.addRow(new Object[] { Integer.valueOf(1), com.tencent.mm.sdk.platformtools.bo.nullAsNil(paramString2) });
          T(0, 0, 1);
          ab.i("MicroMsg.ExtControlProviderOpenApi", "return  code =%s ", new Object[] { Integer.valueOf(1) });
          AppMethodBeat.o(20320);
        }
        catch (Exception paramString2)
        {
        }
      }
  }

  private void brI()
  {
    AppMethodBeat.i(20323);
    String str1 = (String)b.brz().get(ac.a.xOC, null);
    String str2 = brL();
    ab.i("MicroMsg.ExtControlProviderOpenApi", "setSportBroadPkg: pkgNames: %s, pkg: %s", new Object[] { str1, str2 });
    if (str1 != null)
    {
      if (!com.tencent.mm.compatible.loader.a.contains(str1.split(";"), str2))
        b.brz().set(ac.a.xOC, str1 + ";" + brL());
      AppMethodBeat.o(20323);
    }
    while (true)
    {
      return;
      b.brz().set(ac.a.xOC, brL());
      AppMethodBeat.o(20323);
    }
  }

  private Cursor m(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(20319);
    ab.i("MicroMsg.ExtControlProviderOpenApi", "registerMsgReceiver, op = %s", new Object[] { paramString1 });
    if (this.context == null)
    {
      ab.e("MicroMsg.ExtControlProviderOpenApi", "context == null return code = 2001");
      dZ(4, 2001);
      paramString1 = com.tencent.mm.pluginsdk.d.a.a.Kn(2001);
      AppMethodBeat.o(20319);
    }
    while (true)
    {
      return paramString1;
      if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString1))
      {
        ab.e("MicroMsg.ExtControlProviderOpenApi", "wrong args, op is null return code = 2002");
        dZ(3, 2002);
        paramString1 = com.tencent.mm.pluginsdk.d.a.a.Kn(2002);
        AppMethodBeat.o(20319);
        continue;
      }
      int i = -1;
      try
      {
        j = com.tencent.mm.sdk.platformtools.bo.getInt(paramString1, -1);
        if (j == 1)
        {
          paramString1 = P(paramString2, paramString3, paramString4);
          AppMethodBeat.o(20319);
          continue;
        }
        if (j == 2)
        {
          ab.d("MicroMsg.ExtControlProviderOpenApi", "doUnRegisterMsgListener");
          if (b.brA().apN(this.lPW) == null)
          {
            ab.w("MicroMsg.ExtControlProviderOpenApi", "This app never been registered, appId = %s, pkg = %s", new Object[] { this.lPW, brL() });
            paramString1 = com.tencent.mm.pluginsdk.d.a.a.Kn(2007);
            AppMethodBeat.o(20319);
            continue;
          }
          paramString2 = b.brA();
          paramString1 = this.lPW;
          boolean bool;
          if ((paramString1 == null) || (paramString1.length() <= 0))
            bool = false;
          while (true)
          {
            ab.i("MicroMsg.ExtControlProviderOpenApi", "doUnRegisterMsgListener ret = %s, appId = %s, pkg = %s", new Object[] { Boolean.valueOf(bool), this.lPW, brL() });
            if (bool)
              break label321;
            paramString1 = com.tencent.mm.pluginsdk.d.a.a.Kn(2008);
            AppMethodBeat.o(20319);
            break;
            if (paramString2.bSd.delete("OpenMsgListener", "appId=?", new String[] { com.tencent.mm.sdk.platformtools.bo.vA(paramString1) }) <= 0)
              bool = false;
            else
              bool = true;
          }
          label321: T(0, 0, 1);
          paramString1 = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
          AppMethodBeat.o(20319);
          continue;
        }
        ab.e("MicroMsg.ExtControlProviderOpenApi", "wrong args, no such op, %s", new Object[] { Integer.valueOf(j) });
        dZ(3, 2003);
        paramString1 = com.tencent.mm.pluginsdk.d.a.a.Kn(2003);
        AppMethodBeat.o(20319);
      }
      catch (Exception paramString1)
      {
        while (true)
          int j = i;
      }
    }
  }

  // ERROR //
  private Cursor p(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: sipush 20317
    //   3: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ifnull +8 -> 15
    //   10: aload_1
    //   11: arraylength
    //   12: ifne +24 -> 36
    //   15: ldc 111
    //   17: ldc_w 382
    //   20: invokestatic 384	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: iconst_2
    //   24: invokestatic 142	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   27: astore_1
    //   28: sipush 20317
    //   31: invokestatic 145	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   34: aload_1
    //   35: areturn
    //   36: aload_1
    //   37: iconst_0
    //   38: aaload
    //   39: invokestatic 151	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   42: istore_2
    //   43: iconst_1
    //   44: iload_2
    //   45: if_icmpne +123 -> 168
    //   48: aload_1
    //   49: iconst_1
    //   50: aaload
    //   51: invokestatic 151	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   54: istore_2
    //   55: iconst_1
    //   56: iload_2
    //   57: if_icmpeq +78 -> 135
    //   60: iconst_2
    //   61: iload_2
    //   62: if_icmpeq +73 -> 135
    //   65: iconst_2
    //   66: invokestatic 142	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   69: astore_1
    //   70: sipush 20317
    //   73: invokestatic 145	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   76: goto -42 -> 34
    //   79: astore_1
    //   80: ldc 111
    //   82: aload_1
    //   83: ldc_w 386
    //   86: iconst_0
    //   87: anewarray 128	java/lang/Object
    //   90: invokestatic 390	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: iconst_2
    //   94: invokestatic 142	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   97: astore_1
    //   98: sipush 20317
    //   101: invokestatic 145	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   104: goto -70 -> 34
    //   107: astore_1
    //   108: ldc 111
    //   110: aload_1
    //   111: ldc_w 386
    //   114: iconst_0
    //   115: anewarray 128	java/lang/Object
    //   118: invokestatic 390	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: iconst_2
    //   122: invokestatic 142	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   125: astore_1
    //   126: sipush 20317
    //   129: invokestatic 145	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: goto -98 -> 34
    //   135: ldc_w 392
    //   138: invokestatic 398	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   141: checkcast 392	com/tencent/mm/plugin/appbrand/service/b
    //   144: aload_0
    //   145: getfield 99	com/tencent/mm/plugin/ext/openapi/provider/ExtControlProviderOpenApi:context	Landroid/content/Context;
    //   148: iload_2
    //   149: invokeinterface 402 3 0
    //   154: iconst_1
    //   155: invokestatic 142	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   158: astore_1
    //   159: sipush 20317
    //   162: invokestatic 145	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: goto -131 -> 34
    //   168: iconst_2
    //   169: iload_2
    //   170: if_icmpne +24 -> 194
    //   173: ldc_w 392
    //   176: invokestatic 398	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   179: checkcast 392	com/tencent/mm/plugin/appbrand/service/b
    //   182: aload_0
    //   183: getfield 99	com/tencent/mm/plugin/ext/openapi/provider/ExtControlProviderOpenApi:context	Landroid/content/Context;
    //   186: invokeinterface 406 2 0
    //   191: goto -37 -> 154
    //   194: iconst_2
    //   195: invokestatic 142	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   198: astore_1
    //   199: sipush 20317
    //   202: invokestatic 145	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   205: goto -171 -> 34
    //
    // Exception table:
    //   from	to	target	type
    //   36	43	79	java/lang/NumberFormatException
    //   48	55	107	java/lang/NumberFormatException
  }

  private static Cursor q(String[] paramArrayOfString)
  {
    AppMethodBeat.i(20318);
    if ((paramArrayOfString == null) || (paramArrayOfString.length < 2))
    {
      ab.w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid arg length!");
      paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(2);
      AppMethodBeat.o(20318);
    }
    while (true)
    {
      return paramArrayOfString;
      MatrixCursor localMatrixCursor = new MatrixCursor(lPM);
      Object localObject4;
      Object localObject6;
      while (true)
      {
        try
        {
          i = Integer.parseInt(paramArrayOfString[0]);
          j = Integer.parseInt(paramArrayOfString[1]);
          paramArrayOfString = null;
          if (1 != i)
            break label360;
          paramArrayOfString = ((com.tencent.mm.plugin.appbrand.appusage.ag)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.appusage.ag.class)).nA(j);
          Iterator localIterator = com.tencent.luggage.g.c.C(paramArrayOfString).iterator();
          if (!localIterator.hasNext())
            break label532;
          paramArrayOfString = (LocalUsageInfo)localIterator.next();
          localObject1 = ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).zc(paramArrayOfString.appId);
          if (localObject1 == null)
            continue;
          str1 = ((WxaAttributes)localObject1).field_roundedSquareIconURL;
          String str2 = ((WxaAttributes)localObject1).field_brandIconURL;
          localObject2 = ((WxaAttributes)localObject1).field_bigHeadURL;
          localObject3 = (com.tencent.mm.modelappbrand.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.modelappbrand.b.a.class);
          localObject4 = ah.getPackageName();
          i = paramArrayOfString.har;
          localObject5 = ((WxaAttributes)localObject1).field_username;
          String str3 = ((WxaAttributes)localObject1).field_nickname;
          localObject6 = ((WxaAttributes)localObject1).field_appId;
          com.tencent.mm.kernel.g.RN();
          j = com.tencent.mm.kernel.a.QF();
          localObject6 = ((com.tencent.mm.modelappbrand.b.a)localObject3).a((String)localObject4, i, (String)localObject5, str3, new String[] { str1, str2, localObject2 }, (String)localObject6, j, 3);
          if (localObject6 == null)
            continue;
          localObject2 = ((Intent)localObject6).getExtras();
          if (localObject2 == null)
            continue;
          localObject4 = new HashMap();
          localObject5 = ((Bundle)localObject2).keySet().iterator();
          if (!((Iterator)localObject5).hasNext())
            break label385;
          localObject3 = (String)((Iterator)localObject5).next();
          ((Map)localObject4).put(localObject3, ((Bundle)localObject2).get((String)localObject3));
          continue;
        }
        catch (NumberFormatException paramArrayOfString)
        {
          ab.printErrStackTrace("MicroMsg.ExtControlProviderOpenApi", paramArrayOfString, "", new Object[0]);
          paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(2);
          AppMethodBeat.o(20318);
        }
        break;
        label360: if (2 == i)
          paramArrayOfString = ((af)com.tencent.mm.kernel.g.K(af.class)).a(j, null);
      }
      label385: Object localObject2 = paramArrayOfString.username;
      String str1 = paramArrayOfString.appId;
      int j = paramArrayOfString.har;
      Object localObject3 = paramArrayOfString.nickname;
      Object localObject5 = paramArrayOfString.bQo;
      Object localObject1 = ((WxaAttributes)localObject1).field_brandIconURL;
      if (paramArrayOfString.haP);
      for (int i = 1; ; i = 0)
      {
        localMatrixCursor.addRow(new Object[] { localObject2, str1, Integer.valueOf(j), localObject3, localObject5, localObject1, Integer.valueOf(i), Long.valueOf(paramArrayOfString.haQ), ((Intent)localObject6).getPackage(), ((Intent)localObject6).getAction(), new com.tencent.mm.aa.i((Map)localObject4).toString() });
        break;
      }
      label532: AppMethodBeat.o(20318);
      paramArrayOfString = localMatrixCursor;
    }
  }

  private Cursor r(String[] paramArrayOfString)
  {
    AppMethodBeat.i(20321);
    ab.i("MicroMsg.ExtControlProviderOpenApi", "getUserAvatarByOpenId");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      ab.e("MicroMsg.ExtControlProviderOpenApi", "wrong args");
      dZ(3, 3001);
      paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(3001);
      AppMethodBeat.o(20321);
      return paramArrayOfString;
    }
    MatrixCursor localMatrixCursor = new MatrixCursor(lPJ);
    int i = 0;
    Object localObject1;
    while (true)
    {
      try
      {
        if ((i >= paramArrayOfString.length) || (i >= 5))
          break label385;
        if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramArrayOfString[i]))
        {
          localObject1 = b.brB().apZ(paramArrayOfString[i]);
          if ((localObject1 == null) || (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((bz)localObject1).field_openId)) || (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((bz)localObject1).field_username)))
            ab.e("MicroMsg.ExtControlProviderOpenApi", "openidInApp is null");
        }
        else
        {
          label133: i++;
          continue;
        }
        aw.ZK();
        localObject1 = com.tencent.mm.model.c.XM().aoO(((bz)localObject1).field_username);
        if ((localObject1 != null) && (((ap)localObject1).field_username != null) && (((ap)localObject1).field_username.length() > 0))
          break label241;
        ab.e("MicroMsg.ExtControlProviderOpenApi", "contact is null");
        continue;
      }
      catch (Exception paramArrayOfString)
      {
        ab.e("MicroMsg.ExtControlProviderOpenApi", "Exception occur, %s", new Object[] { paramArrayOfString.getMessage() });
        T(7, 4, 12);
        localMatrixCursor.close();
        paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(12);
        AppMethodBeat.o(20321);
      }
      break;
      label241: com.tencent.mm.ah.o.acd();
      localObject1 = com.tencent.mm.ah.d.D(((ap)localObject1).field_username, false);
      if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil((String)localObject1))
        break label275;
      ab.w("MicroMsg.ExtControlProviderOpenApi", "hy: get avatar sfs path is null or nil");
    }
    label275: if (((String)localObject1).startsWith(com.tencent.mm.kernel.g.RP().cachePath))
    {
      int j = com.tencent.mm.kernel.g.RP().cachePath.length();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = com.tencent.mm.kernel.g.RP().eJM + ((String)localObject1).substring(j);
      com.tencent.mm.vfs.e.tf(com.tencent.mm.vfs.e.atb((String)localObject2));
      com.tencent.mm.vfs.e.y((String)localObject1, (String)localObject2);
      localObject1 = localObject2;
    }
    while (true)
    {
      com.tencent.mm.ah.d.b.qk((String)localObject1);
      localMatrixCursor.addRow(new Object[] { paramArrayOfString[i], localObject1 });
      break label133;
      label385: T(6, 0, 1);
      AppMethodBeat.o(20321);
      paramArrayOfString = localMatrixCursor;
      break;
    }
  }

  private Cursor s(String[] paramArrayOfString)
  {
    AppMethodBeat.i(20322);
    ab.i("MicroMsg.ExtControlProviderOpenApi", "decodeVoice");
    Object localObject1;
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0) || (paramArrayOfString[0].length() <= 0))
    {
      ab.e("MicroMsg.ExtControlProviderOpenApi", "decodeVoice wrong args");
      dZ(3, 3101);
      localObject1 = com.tencent.mm.pluginsdk.d.a.a.Kn(3101);
      AppMethodBeat.o(20322);
    }
    while (true)
    {
      return localObject1;
      localObject1 = null;
      int i = 0;
      Object localObject2;
      while (true)
        if ((i < 5) && (i < paramArrayOfString.length))
        {
          String str1 = paramArrayOfString[i];
          Object localObject3 = localObject1;
          try
          {
            if (!com.tencent.mm.modelvoice.o.i(str1, 0, true))
            {
              localObject3 = localObject1;
              ab.w("MicroMsg.ExtControlProviderOpenApi", "wrong args : %s", new Object[] { paramArrayOfString[i] });
            }
            while (true)
            {
              i++;
              break;
              localObject4 = localObject1;
              if (localObject1 == null)
              {
                localObject3 = localObject1;
                localObject4 = new android/database/MatrixCursor;
                localObject3 = localObject1;
                ((MatrixCursor)localObject4).<init>(lPK);
              }
              localObject3 = localObject4;
              locali = new com/tencent/mm/modelvoice/i;
              localObject3 = localObject4;
              locali.<init>();
              localObject3 = localObject4;
              localObject1 = new java/lang/StringBuilder;
              localObject3 = localObject4;
              ((StringBuilder)localObject1).<init>();
              localObject3 = localObject4;
              str2 = b.brD() + "/" + com.tencent.mm.sdk.platformtools.ag.ck(str1);
              localObject3 = localObject4;
              ab.i("MicroMsg.ExtControlProviderOpenApi", "summerpcm pcmPath[%s]", new Object[] { str2 });
              localObject3 = localObject4;
              if (com.tencent.mm.vfs.e.asZ(str2) <= 0L)
                break label346;
              localObject3 = localObject4;
              ab.d("MicroMsg.ExtControlProviderOpenApi", "pcm already exist");
              localObject1 = str2;
              localObject3 = localObject4;
              if (com.tencent.mm.vfs.e.asZ(str2) == 0L)
              {
                localObject3 = localObject4;
                localObject1 = locali.aX(str1, str2);
              }
              localObject3 = localObject4;
              if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil((String)localObject1))
                break label363;
              localObject3 = localObject4;
              ab.w("MicroMsg.ExtControlProviderOpenApi", "wrong args targetFilePath is null");
              localObject1 = localObject4;
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              Object localObject4;
              com.tencent.mm.modelvoice.i locali;
              String str2;
              ab.e("MicroMsg.ExtControlProviderOpenApi", "Exception in decodeVoice, %s", new Object[] { localException.getMessage() });
              localObject2 = localObject3;
              continue;
              label346: localObject3 = localObject4;
              localObject2 = locali.aX(str1, str2);
              continue;
              label363: localObject3 = localObject4;
              ab.d("MicroMsg.ExtControlProviderOpenApi", "decode to pcm success %d", new Object[] { Integer.valueOf(i) });
              localObject3 = localObject4;
              ((MatrixCursor)localObject4).addRow(new Object[] { Integer.valueOf(1), Integer.valueOf(locali.mSampleRate), Integer.valueOf(locali.cpQ), Integer.valueOf(2), localObject2 });
              localObject2 = localObject4;
            }
          }
        }
      if (localObject2 != null)
      {
        T(8, 0, 1);
        AppMethodBeat.o(20322);
      }
      else
      {
        T(9, 3, 4);
        localObject2 = com.tencent.mm.pluginsdk.d.a.a.Kn(4);
        AppMethodBeat.o(20322);
      }
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    AppMethodBeat.i(20315);
    this.handler = new ak();
    AppMethodBeat.o(20315);
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    AppMethodBeat.i(20316);
    ab.i("MicroMsg.ExtControlProviderOpenApi", "query(), ApiId = %s", new Object[] { Integer.valueOf(this.lPO) });
    a(paramUri, this.context, this.lPO, this.lPN);
    paramArrayOfString1 = this.lPW;
    if (paramUri == null)
    {
      ab.e("MicroMsg.ExtControlProviderOpenApi", "uri == null return code = 5");
      dZ(3, 5);
      paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(5);
      AppMethodBeat.o(20316);
    }
    int i;
    label686: long l2;
    while (true)
    {
      return paramUri;
      if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(this.lPW))
      {
        ab.e("MicroMsg.ExtControlProviderOpenApi", "AppID == null return code = 7");
        dZ(3, 7);
        paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(7);
        AppMethodBeat.o(20316);
      }
      else if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(brL()))
      {
        ab.e("MicroMsg.ExtControlProviderOpenApi", "PkgName == null return code = 6");
        dZ(3, 6);
        paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(6);
        AppMethodBeat.o(20316);
      }
      else if (!aVl())
      {
        ab.e("MicroMsg.ExtControlProviderOpenApi", "not login return code = 3");
        dZ(1, 3);
        paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(3);
        AppMethodBeat.o(20316);
      }
      else
      {
        i = 1;
        if (!lPG)
          i = brM();
        if (i != 1)
        {
          ab.e("MicroMsg.ExtControlProviderOpenApi", "invalid appid ! return code = ".concat(String.valueOf(i)));
          dZ(2, i);
          paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(i);
          AppMethodBeat.o(20316);
        }
        else
        {
          switch (this.lPO)
          {
          case 24:
          case 26:
          case 27:
          case 28:
          case 29:
          case 30:
          case 31:
          case 32:
          case 33:
          case 39:
          case 43:
          case 44:
          case 45:
          case 47:
          case 49:
          case 50:
          default:
            dZ(3, 15);
            paramUri = null;
            AppMethodBeat.o(20316);
            break;
          case 22:
            paramUri = m(paramUri.getQueryParameter("op"), paramUri.getQueryParameter("scene"), paramUri.getQueryParameter("msgType"), paramUri.getQueryParameter("msgState"));
            AppMethodBeat.o(20316);
            break;
          case 23:
            paramUri = r(paramArrayOfString2);
            AppMethodBeat.o(20316);
            break;
          case 25:
            paramUri = s(paramArrayOfString2);
            AppMethodBeat.o(20316);
            break;
          case 34:
            ab.i("MicroMsg.ExtControlProviderOpenApi", "sendSight ");
            if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0) || (paramArrayOfString2[0].length() <= 0))
            {
              if (paramArrayOfString2 == null);
              for (boolean bool = true; ; bool = false)
              {
                ab.e("MicroMsg.ExtControlProviderOpenApi", "sendSight wrong args,args == null:%s", new Object[] { Boolean.valueOf(bool) });
                dZ(3, 3401);
                paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(3401);
                AppMethodBeat.o(20316);
                break;
              }
            }
            paramUri = paramArrayOfString2[0];
            if ((com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramUri)) || (!com.tencent.mm.vfs.e.ct(paramUri)))
              i = 0;
            while (true)
            {
              if (i != 0)
                break label686;
              ab.e("MicroMsg.ExtControlProviderOpenApi", "isSightOk wrong args");
              dZ(3, 3402);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(3402);
              AppMethodBeat.o(20316);
              break;
              paramArrayOfString1 = new com.tencent.mm.plugin.sight.base.c();
              if (SightVideoJNI.isSightOk(paramUri, paramArrayOfString1.qxg, paramArrayOfString1.qxh, paramArrayOfString1.qxi, paramArrayOfString1.qxk, paramArrayOfString1.qxj, paramArrayOfString1.qxj.length) == 0)
                i = 1;
              else
                i = 0;
            }
            paramArrayOfString1 = new Intent();
            paramArrayOfString1.addFlags(268435456);
            paramArrayOfString1.addFlags(67108864);
            paramArrayOfString1.putExtra("sight_local_path", paramUri);
            com.tencent.mm.bp.d.f(this.context, ".ui.transmit.SightForwardUI", paramArrayOfString1);
            T(12, 0, 1);
            paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
            AppMethodBeat.o(20316);
            break;
          case 35:
            ab.i("MicroMsg.ExtControlProviderOpenApi", "hy: start redirect to chatting by phone num");
            if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0) || (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramArrayOfString2[0])))
            {
              ab.e("MicroMsg.ExtControlProviderOpenApi", "hy: args error: no phone num or phone num is null or nil");
              dZ(3, 3201);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(3201);
              AppMethodBeat.o(20316);
            }
            else
            {
              paramUri = paramArrayOfString2[0];
              ab.i("MicroMsg.ExtControlProviderOpenApi", "hy: start searching for phone num: %s", new Object[] { paramUri });
              i = new com.tencent.mm.plugin.ext.b.c(this.context, paramUri).brH();
              ab.i("MicroMsg.ExtControlProviderOpenApi", " ret =  ", new Object[] { Integer.valueOf(i) });
              if (i != -1)
              {
                T(14, 0, i);
                i = 0;
              }
              while (true)
              {
                paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(i);
                AppMethodBeat.o(20316);
                break;
                T(15, 0, i);
              }
            }
            break;
          case 36:
            ab.i("MicroMsg.ExtControlProviderOpenApi", "hy: start redirect to wechat out by phone num");
            if ((paramArrayOfString2 == null) || (paramArrayOfString2.length < 3))
            {
              ab.e("MicroMsg.ExtControlProviderOpenApi", "hy: wechat out args error: args length error");
              dZ(3, 3301);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(3301);
              AppMethodBeat.o(20316);
            }
            else
            {
              paramUri = paramArrayOfString2[0];
              i = com.tencent.mm.sdk.platformtools.bo.getInt(paramArrayOfString2[1], -1);
              paramString1 = paramArrayOfString2[2];
              ab.i("MicroMsg.ExtControlProviderOpenApi", "hy: start wechat out: contactid: %s, countrycode: %s,  phone num: %s", new Object[] { paramUri, Integer.valueOf(i), paramString1 });
              if ((com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramUri)) || (i < 0) || (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString1)))
              {
                ab.i("MicroMsg.ExtControlProviderOpenApi", "hy: param err");
                dZ(3, 3302);
                paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(3302);
                AppMethodBeat.o(20316);
              }
              else
              {
                paramArrayOfString1 = new sg();
                paramArrayOfString1.cOy.cOz = paramUri;
                paramArrayOfString1.cOy.cOA = i;
                paramArrayOfString1.cOy.cMQ = paramString1;
                paramArrayOfString1.cOy.bCu = com.tencent.mm.pluginsdk.a.i(paramUri, this.context);
                com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfString1);
                T(16, 0, 1);
                paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
                AppMethodBeat.o(20316);
              }
            }
            break;
          case 37:
            ab.d("MicroMsg.ExtControlProviderOpenApi", "getWifiList");
            this.handler = new ak(Looper.getMainLooper());
            paramUri = (MatrixCursor)new ExtControlProviderOpenApi.1(this, paramArrayOfString2).b(this.handler);
            if (paramUri == null)
            {
              T(19, 4, 14);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(14);
              AppMethodBeat.o(20316);
            }
            else
            {
              T(18, 0, 1);
              ab.i("MicroMsg.ExtControlProviderOpenApi", "returnMatrix syncTaskCur");
              AppMethodBeat.o(20316);
            }
            break;
          case 38:
            ab.d("MicroMsg.ExtControlProviderOpenApi", "connectWifi");
            this.handler = new ak(Looper.getMainLooper());
            paramUri = (Integer)new ExtControlProviderOpenApi.2(this, paramArrayOfString2).b(this.handler);
            if (paramUri == null)
            {
              T(21, 4, 14);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(14);
              AppMethodBeat.o(20316);
            }
            else
            {
              T(20, 0, paramUri.intValue());
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(paramUri.intValue());
              AppMethodBeat.o(20316);
            }
            break;
          case 42:
            paramUri = new Intent();
            paramUri.addFlags(131072);
            paramUri.putExtra("key_from_scene", 4);
            if ((paramArrayOfString2 != null) && (paramArrayOfString2.length > 0) && (paramArrayOfString2[0].length() > 0))
            {
              ab.i("MicroMsg.ExtControlProviderOpenApi", "openOffline business_attach:%s,appid:%s", new Object[] { paramArrayOfString2[0], paramArrayOfString1 });
              paramUri.putExtra("key_business_attach", paramArrayOfString2[0]);
            }
            while (true)
            {
              paramUri.putExtra("key_appid", paramArrayOfString1);
              com.tencent.mm.bp.d.b(this.context, "offline", ".ui.WalletOfflineEntranceUI", paramUri);
              h.pYm.e(12097, new Object[] { Integer.valueOf(9), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
              T(24, 0, 1);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
              AppMethodBeat.o(20316);
              break;
              ab.i("MicroMsg.ExtControlProviderOpenApi", "openOffline appid:%s", new Object[] { paramArrayOfString1 });
            }
          case 40:
            ab.i("MicroMsg.ExtControlProviderOpenApi", "setSportStep start");
            if ((paramArrayOfString2 == null) || (paramArrayOfString2.length < 3))
            {
              ab.e("MicroMsg.ExtControlProviderOpenApi", "args error: args length error");
              T(23, 3, 2);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(2);
              AppMethodBeat.o(20316);
            }
            else
            {
              long l1 = com.tencent.mm.sdk.platformtools.bo.getLong(paramArrayOfString2[0], -1L);
              l2 = com.tencent.mm.sdk.platformtools.bo.getLong(paramArrayOfString2[1], -1L);
              long l3 = com.tencent.mm.sdk.platformtools.bo.getLong(paramArrayOfString2[2], -1L);
              ab.i("MicroMsg.ExtControlProviderOpenApi", "setSportStep: timestampe: %s, stepcount: %s,  version: %s", new Object[] { Long.valueOf(l2), Long.valueOf(l1), Long.valueOf(l3) });
              if ((l2 < 0L) || (l1 < 0L) || (l3 < 0L))
              {
                ab.i("MicroMsg.ExtControlProviderOpenApi", "param err");
                T(23, 3, 2);
                paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(2);
                AppMethodBeat.o(20316);
              }
              else
              {
                brI();
                paramUri = new fp();
                paramUri.czu.action = 2;
                paramUri.czu.czw = l2;
                paramUri.czu.czx = l1;
                paramUri.czu.baZ = l3;
                if ((com.tencent.mm.sdk.b.a.xxA.m(paramUri)) && (paramUri.czv.czz))
                {
                  T(22, 0, paramUri.czv.czA);
                  paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(paramUri.czv.czA);
                  AppMethodBeat.o(20316);
                }
                else
                {
                  T(23, 4, 8);
                  paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(8);
                  AppMethodBeat.o(20316);
                }
              }
            }
            break;
          case 41:
            ab.i("MicroMsg.ExtControlProviderOpenApi", "getSportConfig start");
            brI();
            paramArrayOfString1 = new fp();
            paramArrayOfString1.czu.action = 3;
            if ((com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfString1)) && (paramArrayOfString1.czv.czz))
            {
              paramString1 = paramArrayOfString1.czv.czy;
              paramUri = new MatrixCursor(lPI);
              paramUri.addRow(new Object[] { Integer.valueOf(paramArrayOfString1.czv.czA), com.tencent.mm.sdk.platformtools.bo.nullAsNil(paramString1) });
              T(22, 0, paramArrayOfString1.czv.czA);
              ab.i("MicroMsg.ExtControlProviderOpenApi", "return  code =%s ", new Object[] { Integer.valueOf(paramArrayOfString1.czv.czA) });
              AppMethodBeat.o(20316);
            }
            else
            {
              T(23, 4, 8);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(8);
              AppMethodBeat.o(20316);
            }
            break;
          case 46:
            ab.d("MicroMsg.ExtControlProviderOpenApi", "openClean appid:%s", new Object[] { paramArrayOfString1 });
            aw.ZK();
            if (!com.tencent.mm.model.c.isSDCardAvailable())
            {
              T(27, 5, 4);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4101);
              AppMethodBeat.o(20316);
            }
            else
            {
              paramUri = new Intent();
              paramUri.putExtra("key_from_openapi", true);
              paramUri.putExtra("key_openapi_appid", paramArrayOfString1);
              com.tencent.mm.bp.d.b(this.context, "clean", ".ui.CleanUI", paramUri);
              T(26, 0, 1);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
              AppMethodBeat.o(20316);
            }
            break;
          case 48:
            com.tencent.mm.plugin.ext.c.e.brW().mContext = this.context;
            if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0))
            {
              ab.w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid arg length!");
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4201);
              AppMethodBeat.o(20316);
            }
            else
            {
              i = com.tencent.mm.sdk.platformtools.bo.getInt(paramArrayOfString2[0], -1);
              if ((i < 0) || ((i != 0) && (i != 1) && (i != 2)))
              {
                ab.w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid command!");
                T(32, 3, 2);
                paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4201);
                AppMethodBeat.o(20316);
              }
              else
              {
                paramArrayOfString1 = null;
                if ((i != 0) && (i != 1))
                  break label3540;
                if (paramArrayOfString2.length < 2)
                {
                  ab.w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid arg length when check or open!");
                  paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4205);
                  AppMethodBeat.o(20316);
                }
                else
                {
                  paramUri = paramArrayOfString2[1];
                  if (i != 1)
                    break label3537;
                  if (paramArrayOfString2.length >= 3)
                    break label2294;
                  ab.w("MicroMsg.ExtControlProviderOpenApi", "hy: not providing md5!");
                  paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4208);
                  AppMethodBeat.o(20316);
                }
              }
            }
            break;
          case 51:
          case 52:
          }
        }
      }
    }
    label2294: paramArrayOfString1 = paramArrayOfString2[2];
    while (true)
    {
      ab.i("MicroMsg.ExtControlProviderOpenApi", "hy: cmdid: %d, yuvHandle: %s", new Object[] { Integer.valueOf(i), paramUri });
      switch (i)
      {
      default:
        paramUri = null;
        AppMethodBeat.o(20316);
        break;
      case 0:
        paramString1 = com.tencent.mm.plugin.ext.c.e.brW();
        if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramUri))
        {
          ab.w("MicroMsg.ExtQrCodeHandler", "hy: null handle in doHandleCheckQrCode");
          com.tencent.mm.plugin.ext.c.e.Q(null, -1, 4205);
          paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4205);
          AppMethodBeat.o(20316);
          break;
        }
        paramArrayOfString1 = com.tencent.mm.plugin.ext.c.c.Lj(paramUri);
        if ((paramArrayOfString1 != null) && (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramArrayOfString1.url)))
        {
          ab.i("MicroMsg.ExtQrCodeHandler", "hy: handled previously. yuvhandle: %s, url: %s. direct return", new Object[] { paramUri, paramArrayOfString1 });
          paramUri = paramArrayOfString1;
        }
      case 1:
      case 2:
        label3362: label3534: 
        while (true)
        {
          if (paramUri.type == 19)
          {
            if (com.tencent.mm.plugin.ext.c.c.Ll(paramUri.url))
            {
              ab.i("MicroMsg.ExtQrCodeHandler", "hy: fastjudge wechat cannot open: %s", new Object[] { paramUri.url.toUpperCase() });
              com.tencent.mm.plugin.ext.c.e.Q(paramUri.url, paramUri.type, 4207);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.aiv(paramUri.url);
              AppMethodBeat.o(20316);
              break;
              paramUri = com.tencent.mm.plugin.ext.c.e.aH(paramUri, false);
              if (paramUri == null)
              {
                ab.w("MicroMsg.ExtQrCodeHandler", "hy: not retrieved yuv data in doHandleCheckQrCode");
                com.tencent.mm.plugin.ext.c.e.Q(null, -1, 4206);
                paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4206);
                AppMethodBeat.o(20316);
                break;
              }
              paramUri = paramString1.a(paramUri);
              if ((paramUri != null) && (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramUri.url)))
                break label3534;
              ab.w("MicroMsg.ExtQrCodeHandler", "hy: not resolved model");
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4203);
              AppMethodBeat.o(20316);
              break;
            }
            if (com.tencent.mm.plugin.ext.c.c.Lk(paramUri.url))
            {
              ab.i("MicroMsg.ExtQrCodeHandler", "hy: wechat can open: %s", new Object[] { paramUri.url });
              com.tencent.mm.plugin.ext.c.e.Q(paramUri.url, paramUri.type, 1);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
              AppMethodBeat.o(20316);
              break;
            }
            l2 = com.tencent.mm.sdk.platformtools.bo.yz();
            paramArrayOfString1 = com.tencent.mm.plugin.ext.c.c.Lm(paramUri.url);
            ab.i("MicroMsg.ExtQrCodeHandler", "hy: resolve config: %s, using: %d ms", new Object[] { paramArrayOfString1.toString(), Long.valueOf(com.tencent.mm.sdk.platformtools.bo.az(l2)) });
            if (paramArrayOfString1 == b.b.lQP)
            {
              com.tencent.mm.plugin.ext.c.c.Lh(paramUri.url);
              com.tencent.mm.plugin.ext.c.e.Q(paramUri.url, paramUri.type, 1);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
              AppMethodBeat.o(20316);
              break;
            }
            if (paramArrayOfString1 != b.b.lQO)
            {
              paramArrayOfString1 = paramUri.url;
              i = paramUri.type;
              int j = paramUri.lRd;
              ab.i("MicroMsg.ExtQrCodeHandler", "hy: start remote judge url: %s", new Object[] { paramArrayOfString1 });
              l2 = System.currentTimeMillis();
              paramArrayOfString1 = (Boolean)new e.2(paramString1, Boolean.TRUE, paramArrayOfString1, i, j).b(com.tencent.mm.plugin.ext.c.e.brY());
              ab.i("MicroMsg.ExtQrCodeHandler", "hy: can open: %b, using %d ms", new Object[] { paramArrayOfString1, Long.valueOf(System.currentTimeMillis() - l2) });
              if (paramArrayOfString1.booleanValue())
              {
                com.tencent.mm.plugin.ext.c.c.Lh(paramUri.url);
                com.tencent.mm.plugin.ext.c.e.Q(paramUri.url, paramUri.type, 1);
                paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
                AppMethodBeat.o(20316);
                break;
              }
            }
            com.tencent.mm.plugin.ext.c.c.Li(paramUri.url);
            ab.w("MicroMsg.ExtQrCodeHandler", "hy: remote wechat cannot open: %s", new Object[] { paramUri.url });
            com.tencent.mm.plugin.ext.c.e.Q(paramUri.url, paramUri.type, 4207);
            paramUri = com.tencent.mm.pluginsdk.d.a.a.aiv(paramUri.url);
            AppMethodBeat.o(20316);
            break;
          }
          ab.i("MicroMsg.ExtQrCodeHandler", "hy: subapp code. can open");
          paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
          AppMethodBeat.o(20316);
          break;
          paramArrayOfString2 = com.tencent.mm.plugin.ext.c.e.brW();
          if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramUri))
          {
            ab.w("MicroMsg.ExtQrCodeHandler", "hy: null handle in doHandleOpenQrCode");
            com.tencent.mm.plugin.ext.c.e.R(null, -1, 4205);
            paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4205);
            AppMethodBeat.o(20316);
            break;
          }
          paramString1 = com.tencent.mm.plugin.ext.c.c.Lj(paramUri);
          if ((paramString1 != null) && (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString1.url)))
            ab.i("MicroMsg.ExtQrCodeHandler", "hy: handled previously. yuvhandle: %s, url: %s. direct return", new Object[] { paramUri, paramString1 });
          for (paramUri = paramString1; ; paramUri = paramArrayOfString1)
          {
            if ((paramUri.type != 19) || (!com.tencent.mm.plugin.ext.c.c.Ll(paramUri.url)))
              break label3362;
            ab.i("MicroMsg.ExtQrCodeHandler", "hy: fastjudge wechat cannot open: %s", new Object[] { paramUri.url });
            com.tencent.mm.plugin.ext.c.e.R(paramUri.url, paramUri.type, 4207);
            paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4207);
            AppMethodBeat.o(20316);
            break;
            if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramArrayOfString1))
            {
              ab.w("MicroMsg.ExtQrCodeHandler", "hy: md5 not correct!!");
              com.tencent.mm.plugin.ext.c.e.R(null, -1, 4208);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4208);
              AppMethodBeat.o(20316);
              break;
            }
            paramString1 = com.tencent.mm.plugin.ext.c.e.aH(paramUri, true);
            if (paramString1 == null)
            {
              ab.w("MicroMsg.ExtQrCodeHandler", "hy: not retrieved yuv data in doHandleOpenQrCode");
              com.tencent.mm.plugin.ext.c.e.R(null, -1, 4206);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4206);
              AppMethodBeat.o(20316);
              break;
            }
            if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString1.cvZ))
            {
              ab.w("MicroMsg.ExtQrCodeHandler", "hy: cannot retrieve md5 from yuv!");
              com.tencent.mm.plugin.ext.c.e.R(null, -1, 4210);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4210);
              AppMethodBeat.o(20316);
              break;
            }
            if (!paramString1.cvZ.equalsIgnoreCase(paramArrayOfString1))
            {
              ab.w("MicroMsg.ExtQrCodeHandler", "hy: yuv data not match!!");
              com.tencent.mm.plugin.ext.c.e.R(null, -1, 4209);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4209);
              AppMethodBeat.o(20316);
              break;
            }
            paramArrayOfString1 = paramArrayOfString2.a(paramString1);
            if ((paramArrayOfString1 == null) || (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramArrayOfString1.url)))
            {
              ab.w("MicroMsg.ExtQrCodeHandler", "hy: not resolved model");
              com.tencent.mm.plugin.ext.c.e.R(null, -1, 4203);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(4203);
              AppMethodBeat.o(20316);
              break;
            }
            com.tencent.mm.plugin.ext.c.c.a(paramUri, paramArrayOfString1);
          }
          ab.i("MicroMsg.ExtQrCodeHandler", "hy: do open");
          ab.i("MicroMsg.ExtQrCodeHandler", "hy: start open: %s", new Object[] { paramUri.toString() });
          paramArrayOfString1 = new Intent(paramArrayOfString2.mContext, RedirectToQrCodeStubUI.class);
          paramArrayOfString1.putExtra("K_STR", paramUri.url);
          paramArrayOfString1.putExtra("K_TYPE", paramUri.type);
          paramArrayOfString1.putExtra("K_VERSION", paramUri.lRd);
          paramArrayOfString1.addFlags(268435456);
          paramArrayOfString2.mContext.startActivity(paramArrayOfString1);
          com.tencent.mm.plugin.ext.c.e.R(paramUri.url, paramUri.type, 1);
          paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
          AppMethodBeat.o(20316);
          break;
          com.tencent.mm.plugin.ext.c.e.brW();
          paramUri = com.tencent.mm.plugin.ext.c.e.brX();
          AppMethodBeat.o(20316);
          break;
          paramUri = q(paramArrayOfString2);
          AppMethodBeat.o(20316);
          break;
          paramUri = p(paramArrayOfString2);
          AppMethodBeat.o(20316);
          break;
        }
        label3537: continue;
        label3540: paramUri = null;
      }
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi
 * JD-Core Version:    0.6.2
 */