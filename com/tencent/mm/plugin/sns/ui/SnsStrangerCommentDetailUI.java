package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SnsStrangerCommentDetailUI extends MMActivity
  implements b.b
{
  private static int rxv = 4;
  private long cND;
  private int cvd;
  private ImageView gvq;
  private TextView jWY;
  private View omD;
  private an rhs;
  private com.tencent.mm.plugin.sns.storage.n ros;
  private int rpW;
  private k.a rtZ;
  private ListView rxn;
  private SnsCommentFooter rxo;
  private LinearLayout rxp;
  private List<View> rxq;
  private SnsStrangerCommentDetailUI.a rxr;
  private boolean rxs;
  private boolean rxt;
  private ad rxu;
  private String talker;

  public SnsStrangerCommentDetailUI()
  {
    AppMethodBeat.i(39329);
    this.rxs = false;
    this.rpW = -1;
    this.rxt = false;
    this.rtZ = new SnsStrangerCommentDetailUI.7(this);
    AppMethodBeat.o(39329);
  }

  private static void a(int paramInt, MMImageView paramMMImageView)
  {
    int i = 2131230820;
    AppMethodBeat.i(39340);
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case 3:
    case 4:
    case 5:
    case 6:
    case 1:
    case 7:
    case 2:
    case 8:
    }
    while (true)
    {
      if (j != 0)
        paramMMImageView.setImageResource(j);
      AppMethodBeat.o(39340);
      return;
      j = 2131230800;
      continue;
      j = 2131230817;
      continue;
      j = 2131230798;
      continue;
      j = 2130837705;
      continue;
      j = 2130837705;
      continue;
      paramMMImageView.setImageDrawable(null);
      j = 0;
      continue;
      paramMMImageView.setImageDrawable(null);
      j = 0;
    }
  }

  private void ctP()
  {
    AppMethodBeat.i(39335);
    this.rxp = ((LinearLayout)this.omD.findViewById(2131827858));
    this.gvq = ((ImageView)this.omD.findViewById(2131827708));
    this.jWY = ((TextView)this.omD.findViewById(2131827857));
    a.b.t(this.gvq, this.ros.field_userName);
    String str = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(this.ros.field_userName);
    this.jWY.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, str, this.jWY.getTextSize()));
    ctQ();
    ctR();
    AppMethodBeat.o(39335);
  }

  private void ctQ()
  {
    AppMethodBeat.i(39336);
    this.rxp.removeAllViews();
    int i = BackwardSupportUtil.b.b(this, rxv);
    LinkedList localLinkedList = this.ros.cqu().xfI.wbK;
    this.rxq = new ArrayList();
    int j = 0;
    if (j < localLinkedList.size())
    {
      MMImageView localMMImageView = new MMImageView(this);
      localMMImageView.setPadding(i, i, i, i);
      this.rxp.addView(localMMImageView, new ViewGroup.LayoutParams(-2, -2));
      Bitmap localBitmap = af.cnC().a((bau)localLinkedList.get(j), localMMImageView, hashCode(), az.xYU).Xh();
      if (localBitmap == null)
        a(this.ros.field_type, localMMImageView);
      while (true)
      {
        this.rxq.add(localMMImageView);
        j++;
        break;
        localMMImageView.setImageBitmap(localBitmap);
      }
    }
    AppMethodBeat.o(39336);
  }

  private void ctR()
  {
    AppMethodBeat.i(39337);
    for (int i = 0; i < this.rxq.size(); i++)
    {
      ao localao = new ao();
      localao.czD = this.ros.cqU();
      localao.index = i;
      localao.rsl = this.rxq;
      ((View)this.rxq.get(i)).setTag(localao);
      ((View)this.rxq.get(i)).setOnClickListener(new SnsStrangerCommentDetailUI.9(this));
    }
    AppMethodBeat.o(39337);
  }

  private void ctS()
  {
    AppMethodBeat.i(39338);
    this.rxn.addHeaderView(this.omD);
    this.rxr = new SnsStrangerCommentDetailUI.a(this, this);
    this.rxn.post(new SnsStrangerCommentDetailUI.10(this));
    this.rxn.setAdapter(this.rxr);
    this.rxn.setOnScrollListener(new SnsStrangerCommentDetailUI.11(this));
    AppMethodBeat.o(39338);
  }

  private void ctT()
  {
    AppMethodBeat.i(39339);
    this.rxo.setAfterEditAction(new SnsStrangerCommentDetailUI.2(this));
    this.rxo.ctf();
    this.rxo.setOnCommentSendImp(new SnsStrangerCommentDetailUI.3(this));
    this.rxo.setCommentHint(getString(2131303752) + this.talker + getString(2131303593));
    AppMethodBeat.o(39339);
  }

  public final void Xw(String paramString)
  {
    AppMethodBeat.i(39341);
    ctQ();
    AppMethodBeat.o(39341);
  }

  public final void bj(String paramString, boolean paramBoolean)
  {
  }

  public final void bk(String paramString, boolean paramBoolean)
  {
  }

  public final void cmu()
  {
  }

  public final int getLayoutId()
  {
    return 2130970752;
  }

  public final void initView()
  {
    AppMethodBeat.i(39334);
    this.rxn = ((ListView)findViewById(2131827707));
    this.rxo = ((SnsCommentFooter)findViewById(2131822763));
    this.omD = View.inflate(this, 2130970803, null);
    ctP();
    ctS();
    ctT();
    new SnsStrangerCommentDetailUI.1(this);
    setBackBtn(new SnsStrangerCommentDetailUI.4(this));
    addIconOptionMenu(0, 2130839555, new SnsStrangerCommentDetailUI.5(this));
    AppMethodBeat.o(39334);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39342);
    ab.i("MicroMsg.SnsStrangerCommentDetailUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(39342);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(39342);
      break;
      if (paramInt2 == -1)
      {
        paramIntent = managedQuery(paramIntent.getData(), null, null, null, null);
        if (paramIntent.moveToFirst())
          startActivity(new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/".concat(String.valueOf(paramIntent.getString(paramIntent.getColumnIndexOrThrow("_id")))))));
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39330);
    super.onCreate(paramBundle);
    setMMTitle(2131303611);
    this.cND = getIntent().getLongExtra("INTENT_SNSID", 0L);
    this.talker = getIntent().getStringExtra("INTENT_TALKER");
    this.ros = af.cnF().kD(this.cND);
    this.cvd = getIntent().getIntExtra("INTENT_SOURCE", -1);
    com.tencent.mm.kernel.g.RQ();
    this.rxu = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.talker);
    if ((this.ros == null) || (this.talker == null))
    {
      finish();
      AppMethodBeat.o(39330);
    }
    while (true)
    {
      return;
      this.rhs = new an(this);
      af.cnK().c(this.rtZ);
      initView();
      AppMethodBeat.o(39330);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39333);
    af.cnK().d(this.rtZ);
    af.cnC().ab(this);
    if (this.rxr != null)
      this.rxr.bIf();
    super.onDestroy();
    AppMethodBeat.o(39333);
  }

  public void onPause()
  {
    AppMethodBeat.i(39332);
    af.cnA().b(this);
    super.onPause();
    AppMethodBeat.o(39332);
  }

  public void onResume()
  {
    AppMethodBeat.i(39331);
    af.cnA().a(this);
    super.onResume();
    AppMethodBeat.o(39331);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a$a
  {
    ImageView ejo;
    TextView gKl;
    TextView pnE;
    TextView qeX;
    ImageView rxz;
    TextView timeTv;

    a$a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI
 * JD-Core Version:    0.6.2
 */