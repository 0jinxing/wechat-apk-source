package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.a.kv;
import com.tencent.mm.g.a.np;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.data.SnsCmdList;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.widget.a.d.a;
import java.util.ArrayList;
import java.util.List;

public final class s
  implements f
{
  String IS;
  final Context context;
  int cvn;
  int cvo;
  public int jCq;
  c mip;
  com.tencent.mm.plugin.sns.storage.n qBY;
  String riC;
  boolean riD;
  c riJ;
  String riz;
  SnsCmdList rjk;
  private final s.a rjl;
  com.tencent.mm.ui.widget.a.d rjm;
  boolean rjn;
  bau rjo;
  private final String rjp;
  public com.tencent.mm.ui.base.p tipDialog;

  public s(Context paramContext, s.a parama)
  {
    AppMethodBeat.i(38263);
    this.rjk = new SnsCmdList();
    this.tipDialog = null;
    this.jCq = 0;
    this.rjm = null;
    this.riD = false;
    this.mip = new s.10(this);
    this.riJ = new c()
    {
    };
    this.context = paramContext;
    this.rjl = parama;
    this.rjp = ((Activity)paramContext).getIntent().getStringExtra("sns_gallery_pre_title");
    AppMethodBeat.o(38263);
  }

  protected final void C(com.tencent.mm.plugin.sns.storage.n paramn)
  {
    AppMethodBeat.i(38266);
    if ((paramn.cqV()) || (paramn.cqW()))
    {
      af.cnF().DL(paramn.reX);
      this.rjk.CK(paramn.reX);
      AppMethodBeat.o(38266);
    }
    while (true)
    {
      return;
      af.cnE().km(paramn.field_snsId);
      r localr = new r(paramn.field_snsId, 1);
      g.RQ();
      g.RO().eJo.a(localr, 0);
      paramn = this.context;
      this.context.getString(2131297061);
      this.tipDialog = h.b(paramn, this.context.getString(2131303615), true, new s.7(this, localr));
      AppMethodBeat.o(38266);
    }
  }

  public final void DN(int paramInt)
  {
    AppMethodBeat.i(38262);
    if (paramInt == 0)
      AppMethodBeat.o(38262);
    while (true)
    {
      return;
      this.rjk.CK(paramInt);
      AppMethodBeat.o(38262);
    }
  }

  protected final void Zw(String paramString)
  {
    AppMethodBeat.i(38267);
    Intent localIntent = new Intent();
    localIntent.putExtra("Retr_File_Name", paramString);
    localIntent.putExtra("Retr_Compress_Type", 0);
    localIntent.putExtra("Retr_Msg_Type", 0);
    com.tencent.mm.plugin.sns.c.a.gkE.k(localIntent, this.context);
    AppMethodBeat.o(38267);
  }

  public final void a(boolean paramBoolean1, com.tencent.mm.plugin.sns.storage.n paramn, bau parambau, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(38265);
    this.rjn = paramBoolean1;
    this.qBY = paramn;
    this.rjo = parambau;
    this.IS = parambau.Id;
    final ArrayList localArrayList1 = new ArrayList();
    final ArrayList localArrayList2 = new ArrayList();
    label151: label238: dq localdq;
    if (paramBoolean1)
    {
      if (paramn == null)
      {
        AppMethodBeat.o(38265);
        return;
      }
      if (paramn.field_localPrivate > 0)
      {
        if ((!bo.isNullOrNil(af.cnk())) && (af.cnk().equals(paramn.field_userName)))
        {
          localArrayList1.add(this.context.getString(2131303767));
          localArrayList2.add(Integer.valueOf(5));
        }
        localArrayList1.add(this.context.getString(2131303749));
        localArrayList2.add(Integer.valueOf(3));
        if (com.tencent.mm.bp.d.afj("favorite"))
        {
          localArrayList1.add(this.context.getString(2131301955));
          localArrayList2.add(Integer.valueOf(6));
        }
        if ((paramn.field_type != 15) && (paramn.field_type != 5))
          break label591;
        localArrayList1.add(this.context.getString(2131302712));
        localArrayList2.add(Integer.valueOf(2));
        localdq = new dq();
        localdq.cxc.cwT = paramn.cqU();
        com.tencent.mm.sdk.b.a.xxA.m(localdq);
        if (localdq.cxd.cwB)
        {
          localArrayList1.add(this.context.getString(2131296995));
          localArrayList2.add(Integer.valueOf(8));
        }
        if (this.riC != null)
        {
          if (!com.tencent.mm.plugin.scanner.a.BR(this.cvn))
            break label665;
          localArrayList1.add(this.context.getString(2131302187));
          label345: localArrayList2.add(Integer.valueOf(7));
        }
        if ((this.rjm == null) || (!this.riD))
          break label752;
        this.riD = false;
        label377: this.rjm.rBl = new n.c()
        {
          public final void a(l paramAnonymousl)
          {
            AppMethodBeat.i(38248);
            paramAnonymousl.clear();
            for (int i = 0; i < localArrayList1.size(); i++)
              paramAnonymousl.e(((Integer)localArrayList2.get(i)).intValue(), (CharSequence)localArrayList1.get(i));
            paramAnonymousl.e(-1, s.this.context.getString(2131303614));
            AppMethodBeat.o(38248);
          }
        };
        this.rjm.rBm = new s.3(this, paramn, parambau, paramInt);
        this.rjm.zQf = new d.a()
        {
          public final void onDismiss()
          {
            AppMethodBeat.i(38254);
            Object localObject = new com.tencent.mm.g.a.an();
            ((com.tencent.mm.g.a.an)localObject).ctC.filePath = s.this.riz;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
            s.this.rjm = null;
            s.this.riz = null;
            s.this.qBY = null;
            s.this.IS = null;
            s.this.riC = null;
            localObject = s.this;
            s.this.cvo = 0;
            ((s)localObject).cvn = 0;
            AppMethodBeat.o(38254);
          }
        };
        this.rjm.cpD();
      }
    }
    label591: label752: label894: 
    do
    {
      if (true == paramBoolean2)
      {
        g.RQ();
        if (g.RO().eJo.acS() != 0)
        {
          paramn = new np();
          parambau = com.tencent.mm.plugin.sns.model.an.fZ(af.getAccSnsPath(), this.IS) + i.l(parambau);
          paramn.cJU.filePath = parambau;
          this.riz = parambau;
          com.tencent.mm.sdk.b.a.xxA.m(paramn);
        }
      }
      AppMethodBeat.o(38265);
      break;
      localArrayList1.add(this.context.getString(2131303768));
      localArrayList2.add(Integer.valueOf(1));
      localArrayList1.add(this.context.getString(2131303749));
      localArrayList2.add(Integer.valueOf(3));
      break label151;
      if (paramn.field_type == 1)
      {
        localArrayList1.add(this.context.getString(2131302709));
        localArrayList2.add(Integer.valueOf(2));
        break label238;
      }
      localArrayList1.add(this.context.getString(2131303753));
      localArrayList2.add(Integer.valueOf(2));
      break label238;
      if (com.tencent.mm.plugin.scanner.a.ba(this.cvn, this.riC))
      {
        localArrayList1.add(this.context.getString(2131302188));
        break label345;
      }
      if (com.tencent.mm.plugin.scanner.a.BQ(this.cvn))
      {
        localArrayList1.add(this.context.getString(2131302186));
        break label345;
      }
      localArrayList1.add(this.context.getString(2131302187));
      break label345;
      this.rjm = new com.tencent.mm.ui.widget.a.d(this.context, 1, false);
      break label377;
      paramn.cqu();
      localArrayList1.add(this.context.getString(2131303749));
      localArrayList2.add(Integer.valueOf(3));
      if (com.tencent.mm.bp.d.afj("favorite"))
      {
        localArrayList1.add(this.context.getString(2131301955));
        localArrayList2.add(Integer.valueOf(6));
      }
      if ((paramn.field_type != 15) && (paramn.field_type != 5))
        break label1091;
      localArrayList1.add(this.context.getString(2131302712));
      localArrayList2.add(Integer.valueOf(2));
      localdq = new dq();
      localdq.cxc.cwT = paramn.cqU();
      com.tencent.mm.sdk.b.a.xxA.m(localdq);
      if (localdq.cxd.cwB)
      {
        localArrayList1.add(this.context.getString(2131296995));
        localArrayList2.add(Integer.valueOf(8));
      }
      if (this.riC != null)
      {
        if (!com.tencent.mm.plugin.scanner.a.BR(this.cvn))
          break label1165;
        localArrayList1.add(this.context.getString(2131302187));
        localArrayList2.add(Integer.valueOf(7));
      }
    }
    while (localArrayList1.size() == 0);
    label665: label1001: if ((this.rjm != null) && (this.riD))
      this.riD = false;
    while (true)
    {
      this.rjm.rBl = new s.5(this, localArrayList1, localArrayList2);
      this.rjm.rBm = new s.6(this, paramn, parambau, paramInt);
      this.rjm.cpD();
      break;
      label1091: if (paramn.field_type == 1)
      {
        localArrayList1.add(this.context.getString(2131302709));
        localArrayList2.add(Integer.valueOf(2));
        break label894;
      }
      localArrayList1.add(this.context.getString(2131303753));
      localArrayList2.add(Integer.valueOf(2));
      break label894;
      label1165: if (com.tencent.mm.plugin.scanner.a.ba(this.cvn, this.riC))
      {
        localArrayList1.add(this.context.getString(2131302188));
        break label1001;
      }
      if (!com.tencent.mm.plugin.scanner.a.BQ(this.cvn))
        break label1001;
      localArrayList1.add(this.context.getString(2131302186));
      break label1001;
      this.rjm = new com.tencent.mm.ui.widget.a.d(this.context, 1, false);
    }
  }

  public final void crL()
  {
    AppMethodBeat.i(38264);
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_cmd_list", this.rjk);
    ((Activity)this.context).setResult(-1, localIntent);
    ((Activity)this.context).finish();
    AppMethodBeat.o(38264);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(38268);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramm == null))
    {
      AppMethodBeat.o(38268);
      return;
    }
    ab.i("MicroMsg.GalleryTitleManager", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramm.getType() + " @" + hashCode());
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    paramString = (r)paramm;
    switch (paramString.type)
    {
    case 0:
    default:
    case 1:
    case 2:
    case -1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(38268);
      break;
      this.rjk.CK(paramString.cNE);
      this.rjl.dg(v.ap("sns_table_", paramString.cNE), paramString.type);
      AppMethodBeat.o(38268);
      break;
      this.rjk.CL(paramString.cNE);
      this.rjl.dg("", paramString.type);
      AppMethodBeat.o(38268);
      break;
      this.rjl.dg("", paramString.type);
      AppMethodBeat.o(38268);
      break;
      this.rjk.CL(paramString.cNE);
      this.rjl.dg(v.ap("sns_table_", paramString.cNE), paramString.type);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.s
 * JD-Core Version:    0.6.2
 */