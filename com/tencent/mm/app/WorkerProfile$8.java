package com.tencent.mm.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fc;
import com.tencent.mm.g.a.fc.a;
import com.tencent.mm.plugin.base.stub.WXBizEntryActivity;
import com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

final class WorkerProfile$8 extends c<fc>
{
  WorkerProfile$8(WorkerProfile paramWorkerProfile)
  {
    AppMethodBeat.i(15477);
    this.xxI = fc.class.getName().hashCode();
    AppMethodBeat.o(15477);
  }

  private static boolean a(Context paramContext, String[] paramArrayOfString1, String[] paramArrayOfString2, int paramInt, String paramString)
  {
    AppMethodBeat.i(15479);
    Context localContext = paramContext;
    if (paramContext == null)
    {
      ab.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:context is null.");
      localContext = ah.getContext();
    }
    boolean bool;
    if ((paramArrayOfString1 == null) || (paramArrayOfString1.length < 2))
    {
      ab.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:args error.");
      bool = false;
      AppMethodBeat.o(15479);
    }
    while (true)
    {
      return bool;
      int i = paramArrayOfString1.length;
      for (int j = 0; j < i; j++)
        ab.i("MicroMsg.WorkerProfile", "arg : %s", new Object[] { paramArrayOfString1[j] });
      String str1 = paramArrayOfString1[0];
      String str2 = paramArrayOfString1[1];
      paramContext = null;
      if (paramArrayOfString1.length > 2)
        paramContext = paramArrayOfString1[2];
      i = 0;
      if (paramArrayOfString1.length > 3)
        i = bo.getInt(paramArrayOfString1[3], 0);
      int k = 0;
      if (paramArrayOfString1.length > 4)
        k = bo.getInt(paramArrayOfString1[4], 0);
      ab.i("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:source(%d)", new Object[] { Integer.valueOf(paramInt) });
      switch (paramInt)
      {
      default:
        ab.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:source is out of range.");
        bool = false;
        AppMethodBeat.o(15479);
        break;
      case 1:
        if ((paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
        {
          ab.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:packageNames is null or nil.");
          bool = false;
          AppMethodBeat.o(15479);
        }
        break;
      case 2:
        if (bo.isNullOrNil(paramString))
        {
          ab.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:fromURL(%s) is null or nil.", new Object[] { paramString });
          bool = false;
          AppMethodBeat.o(15479);
        }
        else
        {
          ab.i("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener: appId(%s), toUserName(%s), extInfo(%s), fromURL(%s)", new Object[] { str1, str2, paramContext, paramString });
          if ((bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)))
          {
            ab.e("MicroMsg.WorkerProfile", "appId or toUsername is null or nil.");
            bool = false;
            AppMethodBeat.o(15479);
          }
          else
          {
            j = 0;
            if (i == 1)
              j = 8;
            while (true)
            {
              paramArrayOfString1 = new Intent(localContext, WXBizEntryActivity.class);
              paramArrayOfString1.putExtra("key_command_id", j);
              paramArrayOfString1.putExtra("appId", str1);
              paramArrayOfString1.putExtra("toUserName", str2);
              paramArrayOfString1.putExtra("extInfo", paramContext);
              paramArrayOfString1.putExtra("source", paramInt);
              paramArrayOfString1.putExtra("scene", i);
              paramArrayOfString1.putExtra("jump_profile_type", k);
              paramArrayOfString1.addFlags(268435456).addFlags(67108864);
              if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0))
                break label497;
              paramContext = new ArrayList();
              for (paramInt = 0; paramInt < paramArrayOfString2.length; paramInt++)
                paramContext.add(paramArrayOfString2[paramInt]);
              if (i == 0)
                j = 7;
            }
            paramArrayOfString1.putStringArrayListExtra("androidPackNameList", paramContext);
            label497: localContext.startActivity(paramArrayOfString1);
            bool = true;
            AppMethodBeat.o(15479);
          }
        }
        break;
      }
    }
  }

  private static boolean a(fc paramfc)
  {
    boolean bool = false;
    AppMethodBeat.i(15478);
    if (paramfc == null)
    {
      ab.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:event is null.");
      AppMethodBeat.o(15478);
    }
    while (true)
    {
      return bool;
      if (!(paramfc instanceof fc))
      {
        ab.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:event is not a instance of ExtCallBizEvent.");
        AppMethodBeat.o(15478);
      }
      else if (paramfc.cyu == null)
      {
        ab.e("MicroMsg.WorkerProfile", "ExtCallBizEvent IListener:event.data is null.");
        AppMethodBeat.o(15478);
      }
      else
      {
        switch (paramfc.cyu.op)
        {
        default:
          bool = a(paramfc.cyu.context, paramfc.cyu.selectionArgs, paramfc.cyu.crW, paramfc.cyu.cvd, paramfc.cyu.cyv);
          AppMethodBeat.o(15478);
          break;
        case 27:
          if ((paramfc.cyu.selectionArgs != null) && (paramfc.cyu.selectionArgs.length >= 2))
            break label192;
          ab.e("MicroMsg.WorkerProfile", "ExtCallBizEvent selectionArgs error.");
          AppMethodBeat.o(15478);
          bool = true;
        case 28:
        }
      }
    }
    label192: String str1 = paramfc.cyu.selectionArgs[0];
    String str2 = paramfc.cyu.selectionArgs[1];
    if (paramfc.cyu.selectionArgs.length >= 3);
    for (Object localObject1 = bo.nullAsNil(paramfc.cyu.selectionArgs[2]); ; localObject1 = "")
    {
      try
      {
        String str3 = URLEncoder.encode((String)localObject1, "UTF-8");
        localObject1 = str3;
        label251: if ((str1 == null) || (str2 == null))
        {
          ab.e("MicroMsg.WorkerProfile", "ExtCallBizEvent wrong args, %s, %s", new Object[] { str1, str2 });
          AppMethodBeat.o(15478);
          bool = true;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label251;
      }
      Object localObject2;
      if (paramfc.cyu.selectionArgs.length >= 4)
      {
        localObject2 = paramfc.cyu.selectionArgs[3];
        if (bo.isNullOrNil((String)localObject2));
      }
      for (int i = bo.getInt((String)localObject2, 0); ; i = 0)
      {
        ab.i("MicroMsg.WorkerProfile", "ExtCallBizEvent jump biz tempSession");
        localObject1 = String.format("weixin://dl/business/tempsession/?username=%s&appid=%s&sessionFrom=%s&showtype=%s&scene=%s", new Object[] { str2, str1, localObject1, Integer.valueOf(i), Integer.valueOf(0) });
        localObject2 = new Intent(paramfc.cyu.context, WXCustomSchemeEntryActivity.class);
        ((Intent)localObject2).addFlags(268435456);
        ((Intent)localObject2).setData(Uri.parse((String)localObject1));
        ((Intent)localObject2).putExtra("translate_link_scene", 1);
        paramfc.cyu.context.startActivity((Intent)localObject2);
        AppMethodBeat.o(15478);
        bool = true;
        break;
        ab.i("MicroMsg.WorkerProfile", "ExtCallBizEvent open exdevice rank list.");
        localObject1 = paramfc.cyu.context;
        paramfc = new Intent((Context)localObject1, WXBizEntryActivity.class);
        paramfc.addFlags(268435456);
        paramfc.putExtra("key_command_id", 11);
        ((Context)localObject1).startActivity(paramfc);
        AppMethodBeat.o(15478);
        bool = true;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WorkerProfile.8
 * JD-Core Version:    0.6.2
 */