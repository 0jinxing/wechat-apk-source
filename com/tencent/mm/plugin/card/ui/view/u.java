package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.ui.MMActivity;

public final class u extends i
{
  private View krf;

  public final void bes()
  {
    AppMethodBeat.i(88781);
    if (this.krf != null)
      this.krf.setVisibility(8);
    AppMethodBeat.o(88781);
  }

  public final void initView()
  {
  }

  public final void update()
  {
    AppMethodBeat.i(88780);
    if (this.krf == null)
      this.krf = ((ViewStub)findViewById(2131822029)).inflate();
    b localb = this.kqK.bcv();
    MMActivity localMMActivity = this.kqK.bcy();
    Object localObject = localb.aZW().vSj;
    TextView localTextView1;
    TextView localTextView2;
    LinearLayout localLinearLayout;
    LinearLayout.LayoutParams localLayoutParams1;
    LinearLayout.LayoutParams localLayoutParams2;
    if (this.krf != null)
    {
      localTextView1 = (TextView)this.krf.findViewById(2131822246);
      localTextView1.setText(((tm)localObject).title);
      localTextView1.setTextColor(l.Hn(localb.aZV().color));
      localTextView2 = (TextView)this.krf.findViewById(2131822247);
      localLinearLayout = (LinearLayout)this.krf.findViewById(2131822245);
      localLayoutParams1 = (LinearLayout.LayoutParams)localLinearLayout.getLayoutParams();
      if (!localb.aZD())
        break label407;
      localLayoutParams2 = (LinearLayout.LayoutParams)localTextView1.getLayoutParams();
      if (TextUtils.isEmpty(((tm)localObject).kbX))
        break label383;
      localTextView2.setText(((tm)localObject).kbX);
      localTextView2.setVisibility(0);
      localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(2131428176);
      localLayoutParams2.bottomMargin = localMMActivity.getResources().getDimensionPixelSize(2131427500);
      localObject = (LinearLayout.LayoutParams)localTextView2.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).topMargin = localMMActivity.getResources().getDimensionPixelSize(2131427500);
      localTextView2.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localTextView2.invalidate();
    }
    while (true)
    {
      localLayoutParams2.height = localMMActivity.getResources().getDimensionPixelSize(2131428178);
      localTextView1.setLayoutParams(localLayoutParams2);
      localTextView1.invalidate();
      int i = localMMActivity.getResources().getDimensionPixelSize(2131428180);
      localTextView1.setBackgroundDrawable(l.g(localMMActivity, localb.aZV().color, i));
      localTextView1.setTextColor(l.ah(localMMActivity, localb.aZV().color));
      localLinearLayout.setBackgroundDrawable(null);
      localTextView1.setOnClickListener(this.kqK.bcz());
      localLinearLayout.setLayoutParams(localLayoutParams1);
      localLinearLayout.invalidate();
      this.krf.invalidate();
      if (localb.aZD())
        localLinearLayout.getLayoutParams();
      AppMethodBeat.o(88780);
      return;
      label383: localTextView2.setVisibility(8);
      localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(2131428177);
    }
    label407: if (!TextUtils.isEmpty(((tm)localObject).kbX))
    {
      localTextView2.setText(((tm)localObject).kbX);
      localTextView2.setVisibility(0);
    }
    for (localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(2131428190); ; localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(2131428191))
    {
      localLinearLayout.setOnClickListener(this.kqK.bcz());
      break;
      localTextView2.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.u
 * JD-Core Version:    0.6.2
 */