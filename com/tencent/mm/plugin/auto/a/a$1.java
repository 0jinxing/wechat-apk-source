package com.tencent.mm.plugin.auto.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.aa;
import android.support.v4.app.aa.a;
import android.support.v4.app.v.d;
import android.support.v4.app.v.d.a;
import android.support.v4.app.v.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.b;
import com.tencent.mm.g.a.w;
import com.tencent.mm.g.a.w.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.List;

final class a$1 extends com.tencent.mm.sdk.b.c<w>
{
  a$1(a parama)
  {
    AppMethodBeat.i(17101);
    this.xxI = w.class.getName().hashCode();
    AppMethodBeat.o(17101);
  }

  private static boolean a(w paramw)
  {
    AppMethodBeat.i(17102);
    if ((paramw instanceof w));
    try
    {
      w.a locala = paramw.csR;
      str = paramw.csR.username;
      paramw = paramw.csR.title;
      if (!a.aSl())
        paramw = null;
      while (true)
      {
        locala.csS = paramw;
        AppMethodBeat.o(17102);
        return false;
        Object localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>();
        localObject1 = ((Intent)localObject1).addFlags(32).setAction("com.tencent.mm.permission.MM_AUTO_HEARD_MESSAGE").putExtra("key_username", str);
        e.aL((Intent)localObject1);
        localObject1 = PendingIntent.getBroadcast(ah.getContext(), str.hashCode(), (Intent)localObject1, 134217728);
        Object localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>();
        localObject2 = ((Intent)localObject2).addFlags(32).setAction("com.tencent.mm.permission.MM_AUTO_REPLY_MESSAGE").putExtra("key_username", str);
        e.aL((Intent)localObject2);
        localObject2 = PendingIntent.getBroadcast(ah.getContext(), str.hashCode(), (Intent)localObject2, 134217728);
        Object localObject3 = new android/support/v4/app/aa$a;
        ((aa.a)localObject3).<init>("key_voice_reply_text");
        ((aa.a)localObject3).FV = ah.getContext().getString(2131297033);
        Object localObject4 = new android/support/v4/app/aa;
        ((aa)localObject4).<init>(((aa.a)localObject3).FU, ((aa.a)localObject3).FV, ((aa.a)localObject3).FW, ((aa.a)localObject3).FX, ((aa.a)localObject3).mExtras, ((aa.a)localObject3).FY);
        localObject3 = new android/support/v4/app/v$d$a$a;
        ((v.d.a.a)localObject3).<init>(paramw);
        ((v.d.a.a)localObject3).Fr = ((PendingIntent)localObject1);
        ((v.d.a.a)localObject3).Fp = ((aa)localObject4);
        ((v.d.a.a)localObject3).Fq = ((PendingIntent)localObject2);
        int i = f.kF(str);
        int j = i;
        if (i > 10)
          j = 10;
        aw.ZK();
        Object localObject5 = com.tencent.mm.model.c.XO().cs(str, j);
        j = ((List)localObject5).size() - 1;
        if (j >= 0)
        {
          localObject4 = (bi)((List)localObject5).get(j);
          localObject1 = null;
          if (!t.kH(((cy)localObject4).field_talker))
            break label1696;
          str = ((cy)localObject4).field_talker;
          i = bf.ox(((cy)localObject4).field_content);
          paramw = str;
          if (i != -1)
          {
            localObject2 = ((cy)localObject4).field_content.substring(0, i).trim();
            paramw = str;
            if (localObject2 != null)
            {
              paramw = str;
              if (((String)localObject2).length() > 0)
                paramw = (w)localObject2;
            }
          }
          aw.ZK();
          localObject2 = com.tencent.mm.model.c.XM().aoO(paramw);
          str = s.a((ad)localObject2, paramw);
          if ((!t.kH(paramw)) || ((!((ap)localObject2).field_username.equals(str)) && (!bo.isNullOrNil(str))))
            break label1701;
          str = ah.getContext().getString(2131298223);
          if (((bi)localObject4).drE())
            paramw = ah.getContext().getString(2131301795);
          while (true)
          {
            localObject1 = paramw;
            if (paramw == null)
              localObject1 = ah.getContext().getString(2131301822);
            paramw = (w)localObject1;
            if (str != null)
              paramw = String.format("%s: %s", new Object[] { str, localObject1 });
            ((v.d.a.a)localObject3).Fu.add(paramw);
            if (j == 0)
              ((v.d.a.a)localObject3).Ft = ((cy)localObject4).field_createTime;
            j--;
            break;
            if (((bi)localObject4).isText())
            {
              if ((t.kH(((cy)localObject4).field_talker)) && (((cy)localObject4).field_isSend != 1))
              {
                i = bf.ox(((cy)localObject4).field_content);
                if (i != -1)
                  paramw = ((cy)localObject4).field_content.substring(i + 1).trim();
                else
                  paramw = ((cy)localObject4).field_content;
              }
              else
              {
                paramw = ((cy)localObject4).field_content;
              }
            }
            else if (((bi)localObject4).drD())
            {
              paramw = ah.getContext().getString(2131301831);
            }
            else if (((bi)localObject4).bws())
            {
              paramw = ah.getContext().getString(2131301830);
            }
            else if (((bi)localObject4).bwt())
            {
              paramw = ah.getContext().getString(2131301821);
            }
            else if (((bi)localObject4).bAA())
            {
              localObject2 = j.b.me(((cy)localObject4).field_content);
              paramw = (w)localObject1;
              if (localObject2 != null)
                switch (((j.b)localObject2).type)
                {
                case 7:
                case 9:
                case 11:
                case 12:
                case 14:
                case 17:
                case 18:
                case 21:
                case 22:
                case 23:
                default:
                  paramw = (w)localObject1;
                  break;
                case 2:
                  paramw = String.format(ah.getContext().getString(2131301795), new Object[0]);
                  break;
                case 5:
                  paramw = String.format(ah.getContext().getString(2131301766), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                case 3:
                  paramw = String.format(ah.getContext().getString(2131301769), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                case 6:
                  paramw = String.format(ah.getContext().getString(2131301765), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                case 4:
                  paramw = String.format(ah.getContext().getString(2131301773), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                case 19:
                  paramw = String.format(ah.getContext().getString(2131301771), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                case 24:
                  paramw = ah.getContext().getString(2131299767);
                  break;
                case 15:
                  paramw = String.format(ah.getContext().getString(2131301764), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                case 10:
                  paramw = String.format(ah.getContext().getString(2131301770), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                case 13:
                  paramw = String.format(ah.getContext().getString(2131301768), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                case 20:
                  paramw = String.format(ah.getContext().getString(2131301772), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                case 16:
                  paramw = String.format(ah.getContext().getString(2131301777), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                case 8:
                  paramw = String.format(ah.getContext().getString(2131301778), new Object[] { bo.bc(((j.b)localObject2).title, "") });
                  break;
                }
            }
            else if (((bi)localObject4).dtx())
            {
              paramw = ah.getContext().getString(2131301784);
              localObject1 = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr();
              if (localObject1 == null)
                break label1693;
              localObject2 = ((com.tencent.mm.pluginsdk.a.d)localObject1).Jd(((cy)localObject4).field_imgPath);
              if ((localObject2 == null) || (bo.isNullOrNil(((com.tencent.mm.pluginsdk.a.d)localObject1).Jh(((EmojiInfo)localObject2).Aq()))))
              {
                paramw = ah.getContext().getString(2131301784);
              }
              else
              {
                paramw = new java/lang/StringBuilder;
                paramw.<init>("[");
                paramw = ((com.tencent.mm.pluginsdk.a.d)localObject1).Jh(((EmojiInfo)localObject2).Aq()) + "]";
              }
            }
            else if (((bi)localObject4).bAC())
            {
              paramw = ah.getContext().getString(2131301796);
            }
            else if ((((bi)localObject4).dts()) || (((bi)localObject4).dtt()))
            {
              if (!((cy)localObject4).field_content.equals(bi.xZb))
              {
                paramw = ((cy)localObject4).field_content;
                localObject1 = new com/tencent/mm/g/a/ui;
                ((ui)localObject1).<init>();
                ((ui)localObject1).cQx.cAd = 1;
                ((ui)localObject1).cQx.content = paramw;
                com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
                if (((ui)localObject1).cQy.type != 3)
                  break label1473;
              }
              label1473: for (i = 1; ; i = 0)
              {
                if (i == 0)
                  break label1479;
                paramw = ah.getContext().getString(2131301833);
                break;
              }
              label1479: paramw = ah.getContext().getString(2131301832);
            }
            else if (((bi)localObject4).dtw())
            {
              aw.ZK();
              paramw = com.tencent.mm.model.c.XO().Rn(((cy)localObject4).field_content);
              paramw = String.format(ah.getContext().getString(2131301777), new Object[] { paramw.getDisplayName() });
            }
            else
            {
              paramw = (w)localObject1;
              if (((bi)localObject4).getType() == -1879048186)
                paramw = ah.getContext().getString(2131301767);
            }
          }
        }
        paramw = new android/support/v4/app/v$d;
        paramw.<init>();
        localObject2 = (String[])((v.d.a.a)localObject3).Fu.toArray(new String[((v.d.a.a)localObject3).Fu.size()]);
        str = ((v.d.a.a)localObject3).Fv;
        localObject1 = new android/support/v4/app/v$d$a;
        localObject4 = ((v.d.a.a)localObject3).Fp;
        PendingIntent localPendingIntent = ((v.d.a.a)localObject3).Fq;
        localObject5 = ((v.d.a.a)localObject3).Fr;
        long l = ((v.d.a.a)localObject3).Ft;
        ((v.d.a)localObject1).<init>((String[])localObject2, (aa)localObject4, localPendingIntent, (PendingIntent)localObject5, new String[] { str }, l);
        paramw.Fn = ((v.d.a)localObject1);
      }
    }
    catch (Throwable paramw)
    {
      label1693: label1696: label1701: 
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.auto.AutoLogic", paramw, "", new Object[0]);
        continue;
        continue;
        String str = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.auto.a.a.1
 * JD-Core Version:    0.6.2
 */