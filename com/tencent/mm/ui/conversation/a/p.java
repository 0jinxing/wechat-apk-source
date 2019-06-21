package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.ui.widget.imageview.WeImageView;
import java.lang.ref.WeakReference;

public final class p extends b
{
  private TextView gne;
  private View jyC;
  private View jyD;
  private boolean zwX;
  private WeImageView zxj;

  public p(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(34728);
    this.zwX = false;
    if ((!this.zwX) && (this.view != null))
    {
      this.jyC = this.view.findViewById(2131824110);
      this.jyD = this.view.findViewById(2131821629);
      this.zxj = ((WeImageView)this.view.findViewById(2131826452));
      this.zxj.setIconColor(((Context)this.vlu.get()).getResources().getColor(2131690581));
      this.gne = ((TextView)this.view.findViewById(2131826453));
      this.zwX = true;
    }
    AppMethodBeat.o(34728);
  }

  private static boolean k(Object paramObject, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(34731);
    if (paramObject == null)
      AppMethodBeat.o(34731);
    while (true)
    {
      return bool;
      if (((Integer)paramObject).intValue() != paramInt)
      {
        AppMethodBeat.o(34731);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(34731);
      }
    }
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(34730);
    Object localObject;
    boolean bool;
    if ((this.nfA) && (this.eVH))
    {
      this.jyD.setBackgroundResource(2130840456);
      this.jyC.setBackground(null);
      this.gne.setBackground(null);
      aw.ZK();
      if (!c.XI())
        break label211;
      aw.ZK();
      if (!l.lW(c.XJ()))
        break label211;
      localObject = aw.Rg();
      aw.ZK();
      ((com.tencent.mm.ai.p)localObject).a(new l(c.XJ()), 0);
      bool = false;
    }
    while (true)
    {
      label93: if (bool)
        setVisibility(0);
      while (true)
      {
        AppMethodBeat.o(34730);
        return bool;
        if (this.nfA)
        {
          this.jyD.setBackgroundResource(2130839165);
          this.jyC.setBackgroundResource(2130839164);
          this.gne.setBackgroundResource(2130839162);
          break;
        }
        if (this.eVH)
        {
          this.jyD.setBackgroundResource(2130839165);
          this.jyC.setBackgroundResource(2130839162);
          this.gne.setBackground(null);
          break;
        }
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackground(null);
        this.gne.setBackgroundResource(2130839162);
        break;
        label211: aw.ZK();
        if ((c.XI()) && (!ah.isNullOrNil(l.fOO)) && (!l.ajg()))
        {
          if (r.ku(r.YF()))
            if ((!l.ajj()) && (l.ajh()))
            {
              this.gne.setText(l.fOV);
              label267: this.zxj.setIconColor(((Context)this.vlu.get()).getResources().getColor(2131690581));
              if (l.ajf() != 1)
                break label425;
              if (k(this.zxj.getTag(), 2131231457))
              {
                this.zxj.setTag(Integer.valueOf(2131231457));
                this.zxj.setImageResource(2131231457);
              }
            }
          while (true)
          {
            localObject = new Intent();
            ((Intent)localObject).putExtra("intent.key.online_version", l.aji());
            this.view.setOnClickListener(new p.1(this, (Intent)localObject));
            bool = true;
            break;
            this.gne.setText(l.fOO);
            break label267;
            if ((!l.ajj()) && (l.ajh()))
            {
              this.gne.setText(l.fOW);
              break label267;
            }
            this.gne.setText(l.fOR);
            break label267;
            label425: if (l.ajf() == 2)
            {
              if (l.ajh())
              {
                if (k(this.zxj.getTag(), 2131231463))
                {
                  this.zxj.setTag(Integer.valueOf(2131231463));
                  this.zxj.setImageResource(2131231463);
                }
              }
              else if (k(this.zxj.getTag(), 2131231462))
              {
                this.zxj.setTag(Integer.valueOf(2131231462));
                this.zxj.setImageResource(2131231462);
              }
            }
            else if (l.ajf() == 3)
            {
              if (k(this.zxj.getTag(), 2131231479))
              {
                this.zxj.setTag(Integer.valueOf(2131231479));
                this.zxj.setImageResource(2131231479);
              }
            }
            else if (k(this.zxj.getTag(), 2131232033))
            {
              this.zxj.setTag(Integer.valueOf(2131232033));
              this.zxj.setImageResource(2131232033);
            }
          }
        }
        if (!f.EX_DEVICE_LOGIN)
          break label728;
        aw.ZK();
        if (!c.XI())
          break label728;
        int i = l.getDeviceType();
        if ((l.ajf() != 0) || ((i != 2) && (i != 1)))
          break label728;
        this.view.setOnClickListener(null);
        if (k(this.zxj.getTag(), 2131232033))
        {
          this.zxj.setTag(Integer.valueOf(2131232033));
          this.zxj.setImageResource(2131232033);
        }
        if (i == 2)
        {
          this.gne.setText(2131305887);
          bool = true;
          break label93;
        }
        if (i == 1)
          this.gne.setText(2131305888);
        bool = true;
        break label93;
        setVisibility(8);
      }
      label728: bool = false;
    }
  }

  public final void destroy()
  {
  }

  public final int getLayoutId()
  {
    return 2130970341;
  }

  public final int getOrder()
  {
    return 2;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(34729);
    if (this.jyC != null)
      this.jyC.setVisibility(paramInt);
    AppMethodBeat.o(34729);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.p
 * JD-Core Version:    0.6.2
 */