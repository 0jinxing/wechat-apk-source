package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.product.b.b;
import com.tencent.mm.plugin.product.b.m;
import com.tencent.mm.protocal.protobuf.bpz;
import com.tencent.mm.protocal.protobuf.cx;
import com.tencent.mm.protocal.protobuf.ze;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ListViewInScrollView;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MallProductSubmitUI extends MallBaseUI
  implements x.a
{
  private Button gHn;
  private TextView iDT;
  private com.tencent.mm.plugin.product.b.e phd;
  private com.tencent.mm.plugin.product.b.c piK;
  private RelativeLayout pjJ;
  private TextView pjK;
  private TextView pjL;
  private MallProductItemView pjM;
  private MallProductItemView pjN;
  private TextView pjO;
  private TextView pjP;
  private TextView pjQ;
  private TextView pjR;
  private ListView pjS;
  private a pjT;
  private ImageView pjm;
  private TextView pjn;
  private f pjt;

  private void cu()
  {
    AppMethodBeat.i(44151);
    m localm = this.piK.pgO;
    Object localObject1;
    label184: String str;
    if (this.phd != null)
    {
      this.pjn.setText(b.s(this.phd.phh, this.phd.phh, localm.phs.pcl) + " x " + this.piK.mCount);
      if (!bo.isNullOrNil(this.piK.bZG()))
      {
        localObject1 = x.a(new c(this.piK.bZG()));
        this.pjm.setImageBitmap((Bitmap)localObject1);
        x.a(this);
      }
      this.iDT.setText(localm.phs.name);
      this.pjO.setText(this.piK.bZH());
      localObject1 = this.piK.bZK();
      if ((localObject1 == null) || (bo.isNullOrNil(((bpz)localObject1).naq)))
        break label588;
      this.pjN.setSummary(((bpz)localObject1).naq);
      str = "";
      localObject1 = str;
      if (!this.piK.bZF().cab())
      {
        localObject1 = this.piK.pgT;
        if (localObject1 == null)
          break label600;
        this.pjM.setEnabled(true);
        this.pjM.setClickable(true);
        this.pjM.setSummary(b.a(this, (ze)localObject1));
        localObject1 = getString(2131301375, new Object[] { b.d(((ze)localObject1).vQt, ((ze)localObject1).PriceType) });
        this.pjL.setVisibility(8);
      }
      label277: str = "";
      int i = this.piK.bZJ();
      if (i > 0)
      {
        bo.isNullOrNil((String)localObject1);
        str = getString(2131301374, new Object[] { b.d(i, localm.phs.pcl) });
      }
      Object localObject2 = this.piK.X(this);
      if (((LinkedList)localObject2).size() <= 0)
        break label643;
      this.pjS.setVisibility(0);
      this.pjT.cz((List)localObject2);
      this.pjT.notifyDataSetChanged();
      label368: localObject2 = this.piK.pgU;
      if (localObject2 != null)
        this.pjK.setText(Html.fromHtml(String.format("%s %s<br><br>%s %s %s", new Object[] { ((cx)localObject2).jBB, ((cx)localObject2).vEV, ((cx)localObject2).guO, ((cx)localObject2).guP, ((cx)localObject2).naq })));
      localObject1 = (String)localObject1 + str;
      if (bo.isNullOrNil((String)localObject1))
        break label655;
      localObject1 = getString(2131301373, new Object[] { localObject1 });
      this.pjP.setText((CharSequence)localObject1);
      this.pjQ.setVisibility(8);
      this.pjP.setVisibility(0);
    }
    while (true)
    {
      this.pjR.setText(b.d(this.piK.bZI(), localm.phs.pcl));
      this.gHn.setEnabled(this.piK.bZR());
      AppMethodBeat.o(44151);
      return;
      this.pjn.setText(b.s(localm.phs.phE, localm.phs.phF, localm.phs.pcl));
      break;
      label588: this.pjN.setSummary("");
      break label184;
      label600: this.pjM.setEnabled(false);
      this.pjM.setClickable(false);
      this.pjM.setSummary(getString(2131301376));
      this.pjL.setVisibility(0);
      localObject1 = str;
      break label277;
      label643: this.pjS.setVisibility(8);
      break label368;
      label655: this.pjQ.setVisibility(0);
      this.pjP.setVisibility(8);
    }
  }

  public final int getLayoutId()
  {
    return 2130970400;
  }

  public final void initView()
  {
    AppMethodBeat.i(44150);
    setMMTitle(2131301379);
    this.pjJ = ((RelativeLayout)findViewById(2131826619));
    this.pjK = ((TextView)findViewById(2131826621));
    this.pjL = ((TextView)findViewById(2131826622));
    this.pjM = ((MallProductItemView)findViewById(2131826623));
    this.pjN = ((MallProductItemView)findViewById(2131826624));
    this.pjm = ((ImageView)findViewById(2131826625));
    this.iDT = ((TextView)findViewById(2131826626));
    this.pjO = ((TextView)findViewById(2131826627));
    this.pjn = ((TextView)findViewById(2131826628));
    this.pjP = ((TextView)findViewById(2131826632));
    this.pjQ = ((TextView)findViewById(2131826631));
    this.pjR = ((TextView)findViewById(2131826630));
    this.pjS = ((ListView)findViewById(2131826629));
    this.pjT = new a(this);
    this.pjS.setAdapter(this.pjT);
    this.pjS.setOnItemClickListener(new MallProductSubmitUI.2(this));
    this.gHn = ((Button)findViewById(2131826633));
    this.gHn.setOnClickListener(new MallProductSubmitUI.3(this));
    this.pjJ.setOnClickListener(new MallProductSubmitUI.4(this));
    this.pjM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(44143);
        MallProductSubmitUI.this.showDialog(1);
        AppMethodBeat.o(44143);
      }
    });
    this.pjN.setOnClickListener(new MallProductSubmitUI.6(this));
    MallProductItemView localMallProductItemView = this.pjN;
    if (this.piK.bZF().cac());
    for (int i = 0; ; i = 8)
    {
      localMallProductItemView.setVisibility(i);
      if (this.piK.bZF().cab())
      {
        this.pjM.setEnabled(false);
        this.pjM.setClickable(false);
        this.pjM.setSummary(getString(2131301377));
      }
      AppMethodBeat.o(44150);
      return;
    }
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(44153);
    paramString = new StringBuilder().append(paramString).append(", bitmap = ");
    boolean bool;
    if (paramBitmap == null)
    {
      bool = true;
      ab.d("MicroMsg.MallProductSubmitUI", bool);
      if (!bo.isNullOrNil(this.piK.bZG()))
        break label69;
      AppMethodBeat.o(44153);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label69: this.pjm.post(new MallProductSubmitUI.7(this, paramBitmap));
      AppMethodBeat.o(44153);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(44152);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.pjt.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(44152);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44147);
    super.onCreate(paramBundle);
    this.pjt = new f(this.mController.ylL, new MallProductSubmitUI.1(this));
    com.tencent.mm.plugin.product.a.a.bZC();
    this.piK = com.tencent.mm.plugin.product.a.a.bZD();
    this.phd = this.piK.phd;
    initView();
    cu();
    AppMethodBeat.o(44147);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    AppMethodBeat.i(44154);
    Object localObject1;
    switch (paramInt)
    {
    default:
      localObject1 = super.onCreateDialog(paramInt);
      AppMethodBeat.o(44154);
    case 1:
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = this.piK.phb;
      if (localObject2 == null)
        break;
      localObject1 = new ArrayList();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
        ((List)localObject1).add(b.a(this, (ze)((Iterator)localObject2).next()));
      localObject2 = getString(2131301368);
      MallProductSubmitUI.8 local8 = new MallProductSubmitUI.8(this);
      d.a locala = new d.a(this);
      ListViewInScrollView localListViewInScrollView = (ListViewInScrollView)View.inflate(this, 2130970120, null);
      localListViewInScrollView.setOnItemClickListener(new d.1(local8, locala));
      locala.aEB = ((List)localObject1);
      locala.piC = 0;
      localListViewInScrollView.setAdapter(locala);
      localObject1 = new c.a(this);
      ((c.a)localObject1).asD((String)localObject2);
      ((c.a)localObject1).fn(localListViewInScrollView);
      ((c.a)localObject1).f(null);
      localObject1 = ((c.a)localObject1).aMb();
      ((com.tencent.mm.ui.widget.a.c)localObject1).show();
      AppMethodBeat.o(44154);
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(44148);
    this.pjt.onStart();
    super.onStart();
    AppMethodBeat.o(44148);
  }

  public void onStop()
  {
    AppMethodBeat.i(44149);
    this.pjt.onStop();
    super.onStop();
    AppMethodBeat.o(44149);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSubmitUI
 * JD-Core Version:    0.6.2
 */