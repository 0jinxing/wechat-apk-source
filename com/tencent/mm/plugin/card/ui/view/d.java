package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.ui.MMActivity;

public final class d extends i
{
  private TextView kgG;
  private TextView kqA;
  private TextView kqB;
  private View kqz;

  public final void Hd(String paramString)
  {
    AppMethodBeat.i(88741);
    this.kqB.setText(paramString);
    AppMethodBeat.o(88741);
  }

  public final void bes()
  {
    AppMethodBeat.i(88740);
    this.kqz.setVisibility(8);
    AppMethodBeat.o(88740);
  }

  public final void initView()
  {
    AppMethodBeat.i(88738);
    this.kqz = findViewById(2131822038);
    this.kqA = ((TextView)findViewById(2131822039));
    this.kgG = ((TextView)findViewById(2131822043));
    this.kqB = ((TextView)findViewById(2131821931));
    this.kqA.setOnClickListener(this.kqK.bcz());
    this.kqz.setVisibility(8);
    AppMethodBeat.o(88738);
  }

  public final void update()
  {
    AppMethodBeat.i(88739);
    b localb = this.kqK.bcv();
    Object localObject1 = this.kqK.bcy();
    this.kqz.setVisibility(0);
    Object localObject2;
    if (!TextUtils.isEmpty(localb.aZV().vUh))
    {
      this.kqA.setVisibility(0);
      this.kqA.setText(localb.aZV().vUh);
      if ((localb.aZC()) || ((localb.aZB()) && (localb.aZE())))
      {
        this.kqA.setTextColor(((MMActivity)localObject1).getResources().getColor(2131690691));
        localObject2 = this.kqz.findViewById(2131822040);
        if (!this.kqK.bcA().bec())
          break label516;
        ((View)localObject2).setVisibility(0);
        this.kqB.setText(((MMActivity)localObject1).getString(2131297969));
        this.kqB.setTextColor(((MMActivity)localObject1).getResources().getColor(2131690691));
        int i = ((MMActivity)localObject1).getResources().getDimensionPixelOffset(2131427812);
        Button localButton = (Button)this.kqz.findViewById(2131821932);
        localObject2 = l.b((Context)localObject1, ((MMActivity)localObject1).getResources().getColor(2131690691), i);
        ShapeDrawable localShapeDrawable = l.dI(((MMActivity)localObject1).getResources().getColor(2131690691), i);
        StateListDrawable localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(new int[] { 16842919 }, localShapeDrawable);
        localStateListDrawable.addState(new int[0], (Drawable)localObject2);
        localButton.setBackgroundDrawable(localStateListDrawable);
        i = l.Hn(localb.aZV().color);
        int j = ((MMActivity)localObject1).getResources().getColor(2131690691);
        localButton.setTextColor(new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { i, j }));
        localButton.setOnClickListener(this.kqK.bcz());
        localObject2 = this.kqz.findViewById(2131822041);
        localObject1 = this.kqz.findViewById(2131822042);
        if (localb.aZV().vUv != 1)
          break label496;
        ((View)localObject2).setVisibility(0);
        ((View)localObject1).setVisibility(0);
        AppMethodBeat.o(88739);
      }
    }
    while (true)
    {
      return;
      if ((localb.aZB()) && (localb.aZD()))
      {
        this.kqA.setTextColor(((MMActivity)localObject1).getResources().getColor(2131689820));
        this.kqz.setBackgroundColor(((MMActivity)localObject1).getResources().getColor(2131689822));
        break;
      }
      this.kqA.setTextColor(((MMActivity)localObject1).getResources().getColor(2131690691));
      break;
      this.kqA.setVisibility(8);
      break;
      label496: ((View)localObject2).setVisibility(8);
      ((View)localObject1).setVisibility(8);
      AppMethodBeat.o(88739);
      continue;
      label516: ((View)localObject2).setVisibility(8);
      AppMethodBeat.o(88739);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.d
 * JD-Core Version:    0.6.2
 */