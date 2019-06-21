package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.wy;
import java.util.LinkedList;

public final class k extends i
{
  private View kqL;

  public final void bes()
  {
    AppMethodBeat.i(88753);
    if (this.kqL != null)
      this.kqL.setVisibility(8);
    AppMethodBeat.o(88753);
  }

  public final void initView()
  {
  }

  public final void update()
  {
    AppMethodBeat.i(88752);
    if (this.kqL == null)
      this.kqL = ((ViewStub)findViewById(2131822030)).inflate();
    this.kqL.setOnClickListener(this.kqK.bcz());
    Object localObject1 = this.kqK.bcv().aZV().vUo;
    ImageView localImageView;
    if (!TextUtils.isEmpty(((wy)localObject1).detail))
    {
      ((TextView)findViewById(2131822011)).setText(((wy)localObject1).detail);
      findViewById(2131822010).setVisibility(0);
      localImageView = (ImageView)findViewById(2131822009);
      if ((((wy)localObject1).wcS == null) || (((wy)localObject1).wcS.size() <= 0) || (TextUtils.isEmpty((CharSequence)((wy)localObject1).wcS.get(0))))
        break label240;
      localObject1 = (String)((wy)localObject1).wcS.get(0);
      localImageView.setVisibility(0);
      Object localObject2 = new c.a();
      ((c.a)localObject2).ePK = e.eSn;
      o.ahq();
      ((c.a)localObject2).ePY = null;
      ((c.a)localObject2).ePJ = m.Gz((String)localObject1);
      ((c.a)localObject2).ePH = true;
      ((c.a)localObject2).eQf = false;
      ((c.a)localObject2).ePF = true;
      localObject2 = ((c.a)localObject2).ahG();
      o.ahp().a((String)localObject1, localImageView, (c)localObject2);
      AppMethodBeat.o(88752);
    }
    while (true)
    {
      return;
      findViewById(2131822010).setVisibility(8);
      break;
      label240: localImageView.setVisibility(8);
      AppMethodBeat.o(88752);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.k
 * JD-Core Version:    0.6.2
 */