package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n
{
  public static boolean a(com.tencent.mm.ui.chatting.d.a parama, List<bi> paramList, ad paramad)
  {
    boolean bool = false;
    AppMethodBeat.i(30618);
    if (parama == null)
    {
      ab.w("MicroMsg.ChattingEditModeSendToMail", "do send to mail fail, context is null");
      AppMethodBeat.o(30618);
    }
    while (true)
    {
      return bool;
      if ((paramList == null) || (paramList.isEmpty()))
      {
        ab.w("MicroMsg.ChattingEditModeSendToMail", "do send to mail fail, select item empty");
        AppMethodBeat.o(30618);
      }
      else if ((paramad == null) || ((int)paramad.ewQ <= 0))
      {
        ab.w("MicroMsg.ChattingEditModeSendToMail", "do send to mail fail, contact error");
        AppMethodBeat.o(30618);
      }
      else
      {
        bool = b(parama, paramList, paramad);
        AppMethodBeat.o(30618);
      }
    }
  }

  private static boolean b(com.tencent.mm.ui.chatting.d.a parama, List<bi> paramList, ad paramad)
  {
    boolean bool = false;
    AppMethodBeat.i(30619);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    label143: Object localObject4;
    if (!com.tencent.mm.model.t.kH(paramad.field_username))
    {
      localObject1 = parama.yTx.getMMResources().getString(2131302948);
      localObject2 = paramad.Oi();
      aw.ZK();
      localObject1 = String.format((String)localObject1, new Object[] { localObject2, com.tencent.mm.model.c.Ry().get(4, null) });
      h.pYm.e(10811, new Object[] { Integer.valueOf(7), Integer.valueOf(paramList.size()) });
      if ((r.YK() & 0x1) != 0)
        break label625;
      ab.d("MicroMsg.ChattingEditModeSendToMail", "use qq mail plugin to send mail");
      localObject2 = new ArrayList();
      localObject3 = new ArrayList();
      Iterator localIterator = paramList.iterator();
      if (!localIterator.hasNext())
        break label500;
      localObject4 = (bi)localIterator.next();
      if (!((bi)localObject4).bws())
        break label373;
      o.all();
      ((List)localObject2).add(com.tencent.mm.modelvideo.t.uh(((cy)localObject4).field_imgPath));
      ((List)localObject3).add(null);
    }
    while (true)
    {
      ab.i("MicroMsg.ChattingEditModeSendToMail", "file path = " + localObject2 + "file name = " + localObject3);
      break label143;
      if (bo.isNullOrNil(paramad.field_nickname))
      {
        localObject2 = com.tencent.mm.model.n.my(paramad.field_username).iterator();
        for (localObject1 = ""; ((Iterator)localObject2).hasNext(); localObject1 = (String)localObject1 + (String)localObject3 + ", ")
          localObject3 = s.mJ((String)((Iterator)localObject2).next());
      }
      for (localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 2); ; localObject1 = paramad.Oi())
      {
        localObject1 = String.format(parama.yTx.getMMResources().getString(2131302949), new Object[] { localObject1 });
        break;
      }
      label373: if (((bi)localObject4).bAA())
      {
        localObject4 = j.b.me(((cy)localObject4).field_content);
        if (localObject4 == null)
          break label143;
        switch (((j.b)localObject4).type)
        {
        case 5:
        default:
          break;
        case 4:
        case 6:
          Object localObject5 = am.aUq().aiE(((j.b)localObject4).csD);
          if (localObject5 == null)
            break label143;
          localObject5 = new File(((b)localObject5).field_fileFullPath);
          if (((File)localObject5).exists())
          {
            ((List)localObject2).add(((File)localObject5).getAbsolutePath());
            ((List)localObject3).add(((j.b)localObject4).title);
          }
          break;
        }
      }
    }
    label500: paramList = new QQMailHistoryExporter(parama.yTx.getContext(), paramList, paramad).dCL();
    paramad = new Intent();
    paramad.putExtra("mail_mode", 6);
    paramad.putExtra("mail_content", paramList);
    paramad.putExtra("subject", (String)localObject1);
    paramad.putExtra("show_qqmail", true);
    paramad.putStringArrayListExtra("mail_attach", (ArrayList)localObject2);
    paramad.putStringArrayListExtra("mail_attach_title", (ArrayList)localObject3);
    d.a(parama.yTv, "qqmail", ".ui.ComposeUI", paramad, 220, new n.1(parama));
    AppMethodBeat.o(30619);
    while (true)
    {
      return bool;
      label625: ab.w("MicroMsg.ChattingEditModeSendToMail", "use order mail app to send mail");
      paramList = new aj(parama.yTx.getContext(), paramList, paramad);
      localObject2 = paramList.dCL();
      paramad = new Intent("android.intent.action.SEND_MULTIPLE");
      paramad.setType("message/rfc822");
      paramad.putExtra("android.intent.extra.SUBJECT", (String)localObject1);
      paramad.putExtra("android.intent.extra.TEXT", (String)localObject2);
      localObject1 = parama.yTx.getContext();
      if (paramList.mGM == null)
      {
        bool = true;
        label713: ab.d("MicroMsg.OtherMailHistoryExporter", "get image attach: history is null? %B, selectItems.size = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramList.yIP.size()) });
        if (paramList.mGM == null)
          break label814;
        paramList = paramList.yLW;
        paramad.putParcelableArrayListExtra("android.intent.extra.STREAM", k.d((Context)localObject1, paramList));
      }
      try
      {
        parama.yTx.startActivity(Intent.createChooser(paramad, parama.yTx.getContext().getString(2131302947)));
        AppMethodBeat.o(30619);
        bool = true;
        continue;
        bool = false;
        break label713;
        label814: ab.w("MicroMsg.OtherMailHistoryExporter", "had not exported, do export first");
        paramList.dCL();
        paramList = paramList.yLW;
      }
      catch (ActivityNotFoundException paramList)
      {
        while (true)
          Toast.makeText(parama.yTx.getContext(), 2131302950, 0).show();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.n
 * JD-Core Version:    0.6.2
 */