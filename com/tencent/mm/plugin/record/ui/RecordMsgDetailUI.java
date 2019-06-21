package com.tencent.mm.plugin.record.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.LinkedList;

public class RecordMsgDetailUI extends RecordMsgBaseUI
{
  private boolean cHc = true;
  private String cKa = null;
  private long cvx = -1L;
  private com.tencent.mm.ui.base.p ejZ = null;
  private boolean pKA = false;
  private String pKB = "";
  private String pKC = "";
  private com.tencent.mm.protocal.b.a.c pKz = null;
  private String title = "";

  private String a(com.tencent.mm.protocal.b.a.c paramc)
  {
    AppMethodBeat.i(24244);
    int i;
    com.tencent.mm.protocal.b.a.c localc;
    String str1;
    String str2;
    if (paramc != null)
    {
      Iterator localIterator = paramc.fjr.iterator();
      i = 0;
      localc = null;
      str1 = null;
      str2 = null;
      while (localIterator.hasNext())
      {
        paramc = (aar)localIterator.next();
        if (paramc.wgT.whw.whU != null)
        {
          str2 = this.mController.ylL.getString(2131302200);
          i = 1;
        }
        else
        {
          if (paramc.wgT.whw.cEV == null)
            break label237;
          if (str1 == null)
          {
            str1 = paramc.wgV;
          }
          else
          {
            if (str1 == paramc.wgV)
              break label237;
            paramc = paramc.wgV;
            localc = paramc;
          }
        }
      }
      if ((str1 != null) && (localc == null) && (i == 0))
        paramc = this.mController.ylL.getString(2131299698, new Object[] { str1 });
    }
    while (true)
    {
      AppMethodBeat.o(24244);
      return paramc;
      paramc = str2;
      if (str1 != null)
      {
        paramc = str2;
        if (localc != null)
        {
          paramc = str2;
          if (!str1.equals(localc))
          {
            paramc = str2;
            if (i == 0)
            {
              paramc = this.mController.ylL.getString(2131299697, new Object[] { str1, localc });
              continue;
              label237: paramc = localc;
              break;
              paramc = null;
            }
          }
        }
      }
    }
  }

  private void cu()
  {
    AppMethodBeat.i(24245);
    f localf = new f();
    localf.pJZ = this.pKz.fjr;
    localf.cvx = this.cvx;
    localf.cKa = this.cKa;
    super.ceI();
    this.pKw.a(localf);
    ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().a((e)this.pKw);
    AppMethodBeat.o(24245);
  }

  protected final void ceI()
  {
    AppMethodBeat.i(24243);
    this.cvx = getIntent().getLongExtra("message_id", -1L);
    this.cKa = getIntent().getStringExtra("record_xml");
    this.cHc = getIntent().getBooleanExtra("record_show_share", true);
    this.pKA = getIntent().getBooleanExtra("big_appmsg", false);
    this.pKz = n.VI(this.cKa);
    label157: Object localObject;
    if (this.pKz != null)
      if (a(this.pKz) != null)
      {
        this.title = a(this.pKz);
        if (!bo.ek(this.pKz.fjr))
        {
          this.pKB = ((aar)this.pKz.fjr.getFirst()).wgX;
          this.pKC = ((aar)this.pKz.fjr.getLast()).wgX;
        }
        if ((this.cKa != null) && (this.pKz != null))
          break label339;
        ceQ();
        setBackBtn(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            AppMethodBeat.i(24234);
            RecordMsgDetailUI.this.finish();
            AppMethodBeat.o(24234);
            return true;
          }
        });
        if ((this.pKA) && (am.aUq().lZ(this.cvx) != null))
        {
          aw.ZK();
          localObject = com.tencent.mm.model.c.XO().jf(this.cvx);
          localObject = new com.tencent.mm.plugin.record.b.e(this.cvx, ((cy)localObject).field_msgSvrId, new com.tencent.mm.ai.g()
          {
            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, m paramAnonymousm)
            {
              AppMethodBeat.i(24235);
              if (paramAnonymousInt1 == paramAnonymousInt2)
              {
                if (RecordMsgDetailUI.a(RecordMsgDetailUI.this) != null)
                {
                  RecordMsgDetailUI.a(RecordMsgDetailUI.this).dismiss();
                  RecordMsgDetailUI.b(RecordMsgDetailUI.this);
                }
                aw.ZK();
                bi localbi = com.tencent.mm.model.c.XO().jf(RecordMsgDetailUI.c(RecordMsgDetailUI.this));
                paramAnonymousm = localbi.field_content;
                if (t.kH(localbi.field_talker))
                  paramAnonymousm = bf.oz(localbi.field_content);
                paramAnonymousm = j.b.me(paramAnonymousm);
                if (paramAnonymousm != null)
                {
                  RecordMsgDetailUI.a(RecordMsgDetailUI.this, paramAnonymousm.fgU);
                  RecordMsgDetailUI.a(RecordMsgDetailUI.this, n.VI(RecordMsgDetailUI.d(RecordMsgDetailUI.this)));
                  if (RecordMsgDetailUI.e(RecordMsgDetailUI.this) != null)
                  {
                    if (RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this)) == null)
                      break label242;
                    RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this)));
                  }
                }
              }
              while (true)
              {
                RecordMsgDetailUI.c(RecordMsgDetailUI.this, ((aar)RecordMsgDetailUI.e(RecordMsgDetailUI.this).fjr.getFirst()).wgX);
                RecordMsgDetailUI.d(RecordMsgDetailUI.this, ((aar)RecordMsgDetailUI.e(RecordMsgDetailUI.this).fjr.getLast()).wgX);
                RecordMsgDetailUI.f(RecordMsgDetailUI.this);
                AppMethodBeat.o(24235);
                return;
                label242: RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this).title);
              }
            }
          });
          aw.Rg().a((m)localObject, 0);
        }
        AppMethodBeat.o(24243);
      }
    while (true)
    {
      return;
      this.title = this.pKz.title;
      break;
      aw.ZK();
      localObject = com.tencent.mm.model.c.XO().jf(this.cvx);
      localObject = j.b.X(((cy)localObject).field_content, ((cy)localObject).field_reserved);
      if (localObject == null)
        break label157;
      this.title = ((j.b)localObject).title;
      this.ejZ = com.tencent.mm.ui.base.p.b(this, getString(2131300968), true, null);
      break label157;
      label339: cu();
      AppMethodBeat.o(24243);
    }
  }

  protected final h ceJ()
  {
    AppMethodBeat.i(24246);
    e locale = new e(this, new g());
    locale.fromScene = getIntent().getIntExtra("from_scene", 0);
    AppMethodBeat.o(24246);
    return locale;
  }

  protected final String ceK()
  {
    return this.title;
  }

  protected final String ceL()
  {
    return this.pKB;
  }

  protected final String ceM()
  {
    return this.pKC;
  }

  protected final void ceN()
  {
    AppMethodBeat.i(24248);
    if (!this.cHc)
      AppMethodBeat.o(24248);
    while (true)
    {
      return;
      addIconOptionMenu(0, 2130839555, new RecordMsgDetailUI.3(this));
      AppMethodBeat.o(24248);
    }
  }

  protected final void d(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    AppMethodBeat.i(24249);
    if (-1 != paramInt2)
    {
      ab.e("MicroMsg.RecordMsgDetailUI", "processResult %d", new Object[] { Integer.valueOf(paramInt2) });
      AppMethodBeat.o(24249);
    }
    while (true)
    {
      return;
      Object localObject;
      if (1001 == paramInt1)
      {
        if (paramIntent == null)
        {
          localObject = null;
          label52: if (paramIntent != null)
            break label96;
        }
        label96: for (paramIntent = null; ; paramIntent = paramIntent.getStringExtra("custom_send_text"))
        {
          if (!bo.isNullOrNil((String)localObject))
            break label107;
          ab.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but toUser is null");
          AppMethodBeat.o(24249);
          break;
          localObject = paramIntent.getStringExtra("Select_Conv_User");
          break label52;
        }
        label107: aw.ZK();
        final bi localbi = com.tencent.mm.model.c.XO().jf(this.cvx);
        if (localbi.field_msgId != this.cvx)
        {
          ab.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but message info is null");
          AppMethodBeat.o(24249);
        }
        else
        {
          final com.tencent.mm.ui.base.p localp = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131299643), false, null);
          aw.RS().aa(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(24240);
              n.a(this.cgl, paramIntent, localbi);
              al.d(new RecordMsgDetailUI.4.1(this));
              AppMethodBeat.o(24240);
            }

            public final String toString()
            {
              AppMethodBeat.i(24241);
              String str = super.toString() + "|onActivityResult";
              AppMethodBeat.o(24241);
              return str;
            }
          });
          AppMethodBeat.o(24249);
        }
      }
      else
      {
        if ((1002 == paramInt1) && (paramIntent.getBooleanExtra("kfavorite", false)))
        {
          localObject = new cl();
          com.tencent.mm.pluginsdk.model.e.a((cl)localObject, paramIntent);
          ((cl)localObject).cvA.activity = this;
          ((cl)localObject).cvA.cvH = 8;
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
        }
        AppMethodBeat.o(24249);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24242);
    super.onCreate(paramBundle);
    AppMethodBeat.o(24242);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24247);
    super.onDestroy();
    ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b((e)this.pKw);
    AppMethodBeat.o(24247);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgDetailUI
 * JD-Core Version:    0.6.2
 */