package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.sharecard.model.r;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;

public final class x extends i
{
  MMActivity jiE;
  private boolean kri;
  private View krj;
  private View krk;
  private ImageView krl;
  private TextView krm;
  private TextView krn;
  private ImageView kro;
  View krp;
  private LinearLayout krq;
  private View.OnClickListener krr;

  public x()
  {
    AppMethodBeat.i(88785);
    this.kri = false;
    this.krr = new x.1(this);
    AppMethodBeat.o(88785);
  }

  public final void bes()
  {
    AppMethodBeat.i(88788);
    this.krj.setVisibility(8);
    AppMethodBeat.o(88788);
  }

  public final void initView()
  {
    AppMethodBeat.i(88786);
    this.krj = findViewById(2131822016);
    this.krk = findViewById(2131822302);
    this.krl = ((ImageView)findViewById(2131822304));
    this.krm = ((TextView)findViewById(2131822305));
    this.krn = ((TextView)findViewById(2131822306));
    this.kro = ((ImageView)findViewById(2131822307));
    this.krj.setVisibility(8);
    this.krp = findViewById(2131822308);
    this.krq = ((LinearLayout)findViewById(2131822309));
    this.krp.setVisibility(8);
    this.jiE = this.kqK.bcy();
    AppMethodBeat.o(88786);
  }

  public final void update()
  {
    AppMethodBeat.i(88787);
    Object localObject1 = this.kqK.bcv();
    Object localObject2 = com.tencent.mm.plugin.card.sharecard.a.b.GD(((com.tencent.mm.plugin.card.base.b)localObject1).baa());
    Object localObject3 = this.kqK.bcA();
    Object localObject4;
    Object localObject6;
    Object localObject7;
    label335: label510: int i;
    if (((g)localObject3).bdO())
    {
      this.krj.setVisibility(0);
      if (com.tencent.mm.plugin.card.sharecard.a.b.GC(((com.tencent.mm.plugin.card.base.b)localObject1).baa()) > 1)
        this.krk.setOnClickListener(this.kqK.bcz());
      while (true)
      {
        localObject1 = this.kqK.bcv();
        if (!this.kqK.bcw())
          break;
        this.krl.setVisibility(8);
        this.krm.setVisibility(8);
        this.krn.setVisibility(0);
        this.kro.setImageResource(2130838121);
        this.krn.setText(this.jiE.getString(2131297974));
        if (!this.kqK.bcw())
          break label865;
        this.krp.setVisibility(0);
        if ((this.krq.getChildCount() != 0) || (localObject2 == null))
          break label732;
        localObject3 = (LayoutInflater)this.jiE.getSystemService("layout_inflater");
        localObject4 = ((ArrayList)localObject2).iterator();
        while (true)
        {
          if (!((Iterator)localObject4).hasNext())
            break label714;
          localObject1 = (r)((Iterator)localObject4).next();
          localObject2 = ((LayoutInflater)localObject3).inflate(2130970668, this.krq, false);
          Object localObject5 = (ImageView)((View)localObject2).findViewById(2131827539);
          localObject6 = (TextView)((View)localObject2).findViewById(2131824477);
          localObject7 = (TextView)((View)localObject2).findViewById(2131827542);
          if (!TextUtils.isEmpty(((r)localObject1).kfT))
          {
            a.b.b((ImageView)localObject5, ((r)localObject1).kfT);
            localObject5 = l.Hp(((r)localObject1).kfT);
            if (TextUtils.isEmpty((CharSequence)localObject5))
              break;
            ((TextView)localObject6).setText(j.f(this.jiE, (CharSequence)localObject5, this.jiE.getResources().getDimensionPixelOffset(2131427866)));
          }
          ((TextView)localObject7).setText("x " + ((r)localObject1).kfU);
          ((View)localObject2).setTag(localObject1);
          ((View)localObject2).setOnClickListener(this.krr);
          localObject7 = (ImageView)((View)localObject2).findViewById(2131827541);
          localObject6 = (ImageView)((View)localObject2).findViewById(2131827540);
          if (!((r)localObject1).kfW)
            break label697;
          ((ImageView)localObject7).setVisibility(0);
          ((ImageView)localObject6).setVisibility(0);
          label415: this.krq.addView((View)localObject2);
        }
        this.kro.setVisibility(8);
        this.krp.setVisibility(8);
        this.krq.removeAllViews();
        this.kqK.bcx();
      }
      this.krl.setVisibility(0);
      this.krm.setVisibility(0);
      this.krn.setVisibility(8);
      if (com.tencent.mm.plugin.card.sharecard.a.b.GC(((com.tencent.mm.plugin.card.base.b)localObject1).baa()) <= 1)
      {
        this.kro.setVisibility(8);
        if ((localObject2 == null) || (((ArrayList)localObject2).size() <= 0))
          break label1057;
        i = 0;
        label524: if (i >= ((ArrayList)localObject2).size())
          break label1057;
        localObject3 = (r)((ArrayList)localObject2).get(i);
        if (!((r)localObject3).kfW)
          break label680;
      }
    }
    label1052: label1057: for (localObject3 = ((r)localObject3).kfT; ; localObject3 = "")
    {
      localObject4 = localObject3;
      if (TextUtils.isEmpty((CharSequence)localObject3))
      {
        localObject4 = localObject3;
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject1).bab()))
          localObject4 = ((com.tencent.mm.plugin.card.base.b)localObject1).bab();
      }
      if (TextUtils.isEmpty((CharSequence)localObject4))
        break;
      a.b.b(this.krl, (String)localObject4);
      localObject3 = this.jiE.getString(2131297979, new Object[] { l.Hp((String)localObject4) });
      this.krm.setText(j.f(this.jiE, (CharSequence)localObject3, this.jiE.getResources().getDimensionPixelOffset(2131427813)));
      break;
      this.kro.setVisibility(0);
      this.kro.setImageResource(2130838120);
      break label510;
      label680: i++;
      break label524;
      ((TextView)localObject6).setText("");
      break label335;
      label697: ((ImageView)localObject7).setVisibility(8);
      ((ImageView)localObject6).setVisibility(8);
      break label415;
      label714: this.krq.invalidate();
      this.kri = true;
      AppMethodBeat.o(88787);
      label731: return;
      label732: i = 0;
      if (i < this.krq.getChildCount())
      {
        localObject4 = this.krq.getChildAt(i);
        if ((localObject2 == null) || (((ArrayList)localObject2).size() < this.krq.getChildCount()))
          break label1052;
      }
      for (localObject3 = (r)((ArrayList)localObject2).get(i); ; localObject3 = null)
      {
        localObject1 = (ImageView)((View)localObject4).findViewById(2131827541);
        localObject4 = (ImageView)((View)localObject4).findViewById(2131827540);
        if ((localObject3 != null) && (((r)localObject3).kfW))
        {
          ((ImageView)localObject1).setVisibility(0);
          ((ImageView)localObject4).setVisibility(0);
        }
        while (true)
        {
          i++;
          break;
          ((ImageView)localObject1).setVisibility(8);
          ((ImageView)localObject4).setVisibility(8);
        }
        this.krq.invalidate();
        break;
        label865: this.krp.setVisibility(8);
        this.krq.removeAllViews();
        break;
        if (!((g)localObject3).bdO())
        {
          this.krj.setVisibility(0);
          this.krl.setVisibility(0);
          this.krm.setVisibility(0);
          this.krn.setVisibility(8);
          this.kro.setVisibility(8);
          localObject4 = "";
          localObject3 = localObject4;
          if (TextUtils.isEmpty(""))
          {
            localObject3 = localObject4;
            if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject1).bab()))
              localObject3 = ((com.tencent.mm.plugin.card.base.b)localObject1).bab();
          }
          if (!TextUtils.isEmpty((CharSequence)localObject3))
          {
            a.b.b(this.krl, (String)localObject3);
            localObject3 = this.jiE.getString(2131297979, new Object[] { l.Hp((String)localObject3) });
            this.krm.setText(j.f(this.jiE, (CharSequence)localObject3, this.jiE.getResources().getDimensionPixelOffset(2131427813)));
          }
          this.kri = true;
        }
        AppMethodBeat.o(88787);
        break label731;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.x
 * JD-Core Version:    0.6.2
 */