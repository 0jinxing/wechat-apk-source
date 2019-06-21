package com.tencent.mm.plugin.webwx.a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.pt;
import com.tencent.mm.g.a.pt.a;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI;
import com.tencent.mm.protocal.protobuf.zk;
import com.tencent.mm.protocal.protobuf.zl;
import com.tencent.mm.protocal.protobuf.zn;
import com.tencent.mm.protocal.protobuf.zq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.be;

final class g$3$1
  implements f
{
  g$3$1(g.3 param3, d paramd, pt parampt)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26510);
    aw.Rg().b(971, this);
    zn localzn = (zn)this.uLl.fAT.fsH.fsP;
    ab.d("MicroMsg.SubCoreWebWX", "errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
    Intent localIntent;
    StringBuilder localStringBuilder;
    Object localObject;
    Cursor localCursor1;
    Cursor localCursor2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (localzn.weL == null)
        break label964;
      localIntent = new Intent();
      localIntent.putExtra("intent.key.login.url", this.uLm.cLX.cLY);
      localIntent.putExtra("intent.key.type", 0);
      localIntent.putExtra("intent.key.icon.type", localzn.weL.weH);
      localIntent.putExtra("intent.key.ok.string", localzn.weL.weV);
      localIntent.putExtra("intent.key.cancel.string", localzn.weL.weW);
      localIntent.putExtra("intent.key.title.string", localzn.weL.weI);
      localIntent.putExtra("intent.key.content.string", localzn.weL.wfa);
      localIntent.putExtra("intent.key.login.client.version", localzn.weP);
      localIntent.putExtra("intent.key.function.control", localzn.weQ);
      paramm = localzn.weL.weI;
      localStringBuilder = new StringBuilder();
      localObject = null;
      localCursor1 = null;
      localCursor2 = localCursor1;
      paramString = localObject;
    }
    while (true)
    {
      try
      {
        aw.ZK();
        localCursor2 = localCursor1;
        paramString = localObject;
        localCursor1 = c.XR().a(t.fkP, null, com.tencent.mm.o.a.ewS, true);
        if (localCursor1 != null)
        {
          localCursor2 = localCursor1;
          paramString = localCursor1;
          if (localCursor1.getCount() < localzn.weL.weX)
          {
            localCursor2 = localCursor1;
            paramString = localCursor1;
            paramInt1 = localCursor1.getCount();
            localCursor2 = localCursor1;
            paramString = localCursor1;
            int i = localCursor1.getColumnIndex("username");
            paramInt2 = 0;
            if (paramInt2 < paramInt1)
            {
              localCursor2 = localCursor1;
              paramString = localCursor1;
              if (localCursor1.moveToPosition(paramInt2))
              {
                localCursor2 = localCursor1;
                paramString = localCursor1;
                localStringBuilder.append(localCursor1.getString(i));
                if (paramInt2 < paramInt1 - 1)
                {
                  localCursor2 = localCursor1;
                  paramString = localCursor1;
                  localStringBuilder.append(",");
                }
              }
              paramInt2++;
              continue;
            }
          }
          else
          {
            localCursor2 = localCursor1;
            paramString = localCursor1;
            paramInt1 = localzn.weL.weX;
            continue;
          }
        }
        localCursor2 = localCursor1;
        paramString = localCursor1;
        localIntent.putExtra("intent.key.ok.session.list", localStringBuilder.toString());
        if (localCursor1 != null)
        {
          localCursor1.close();
          paramString = paramm;
          paramm = localIntent;
          if (paramm != null)
          {
            paramm.setFlags(268435456);
            paramm.setClass(ah.getContext(), ExtDeviceWXLoginUI.class);
            ah.getContext().startActivity(paramm);
            paramm = new Intent(paramm);
            paramm.setFlags(67108864);
            if (this.uLm.cLX.type == 1)
            {
              paramm = PendingIntent.getActivity(ah.getContext(), 0, paramm, 134217728);
              paramString = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g(null).j(System.currentTimeMillis()).d(ah.getContext().getString(2131296982)).e(paramString);
              paramString.EI = paramm;
              paramString = paramString.build();
              paramString.icon = com.tencent.mm.bo.a.bWV();
              paramString.flags |= 16;
              paramString.sound = RingtoneManager.getDefaultUri(2);
              aw.getNotification().notify(38, paramString);
            }
          }
          AppMethodBeat.o(26510);
          return;
        }
      }
      catch (Exception localException)
      {
        paramString = localCursor2;
        ab.printErrStackTrace("MicroMsg.SubCoreWebWX", localException, "[oneliang]get session list error.", new Object[0]);
        if (localCursor2 != null)
        {
          localCursor2.close();
          paramString = paramm;
          paramm = localIntent;
          continue;
        }
      }
      finally
      {
        if (paramString != null)
          paramString.close();
        AppMethodBeat.o(26510);
      }
      paramString = paramm;
      paramm = localIntent;
      continue;
      if (paramInt2 == -1)
      {
        if (localzn.weM != null)
        {
          paramm = new Intent();
          paramm.putExtra("intent.key.login.url", this.uLm.cLX.cLY);
          paramm.putExtra("intent.key.type", -1);
          paramm.putExtra("intent.key.title.string", localzn.weM.weJ);
          paramm.putExtra("intent.key.icon.type", localzn.weM.weH);
          paramm.putExtra("intent.key.ok.string", localzn.weM.weK);
          paramm.putExtra("intent.key.content.string", localzn.weM.weI);
          paramString = localzn.weM.weI;
        }
      }
      else if ((paramInt2 == -2) && (localzn.weN != null))
      {
        paramm = new Intent();
        paramm.putExtra("intent.key.login.url", this.uLm.cLX.cLY);
        paramm.putExtra("intent.key.type", -2);
        paramm.putExtra("intent.key.title.string", localzn.weN.weJ);
        paramm.putExtra("intent.key.icon.type", localzn.weN.weH);
        paramm.putExtra("intent.key.ok.string", localzn.weN.weK);
        paramm.putExtra("intent.key.content.string", localzn.weN.weI);
        paramString = localzn.weN.weI;
      }
      else
      {
        label964: paramString = null;
        paramm = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.a.g.3.1
 * JD-Core Version:    0.6.2
 */