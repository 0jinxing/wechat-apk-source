package com.tencent.mm.plugin.appbrand.widget.i;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Iterator;
import java.util.LinkedList;

public class a extends FrameLayout
{
  public f joU;
  protected LinearLayout joV;
  private ImageView joW;
  protected String joX;
  protected int joY;
  protected int joZ;
  protected LinkedList<a.a> jpa;
  public LinkedList<Pair<d, d>> jpb;
  private int jpc;
  private b jpd;
  private int mHeight;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(87543);
    this.mHeight = 0;
    this.jpc = 0;
    this.jpa = new LinkedList();
    this.jpb = new LinkedList();
    this.joU = new f();
    setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    this.joW = new ImageView(paramContext);
    this.joW.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    addView(this.joW);
    this.joV = new LinearLayout(paramContext);
    this.joV.setOrientation(0);
    this.joV.setGravity(16);
    this.joV.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    addView(this.joV);
    AppMethodBeat.o(87543);
  }

  private void a(Animator paramAnimator, Runnable paramRunnable)
  {
    AppMethodBeat.i(87551);
    paramAnimator.addListener(new a.11(this, paramRunnable));
    paramAnimator.start();
    AppMethodBeat.o(87551);
  }

  private static int fromDPToPix(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(138234);
    paramInt = Math.round(paramContext.getResources().getDisplayMetrics().density * paramInt);
    AppMethodBeat.o(138234);
    return paramInt;
  }

  private void refreshView()
  {
    AppMethodBeat.i(87552);
    post(new a.12(this));
    AppMethodBeat.o(87552);
  }

  public final int EV(String paramString)
  {
    AppMethodBeat.i(87556);
    LinkedList localLinkedList = this.jpa;
    String str = h.bO(paramString);
    Iterator localIterator = this.jpa.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      paramString = (a.a)localIterator.next();
    }
    while (!h.bO(paramString.mUrl).equals(str));
    while (true)
    {
      int i = localLinkedList.indexOf(paramString);
      AppMethodBeat.o(87556);
      return i;
      paramString = null;
    }
  }

  public final void a(int paramInt, String paramString, d paramd1, d paramd2)
  {
    AppMethodBeat.i(87547);
    if (paramInt >= this.jpa.size())
      AppMethodBeat.o(87547);
    while (true)
    {
      return;
      a.a locala = (a.a)this.jpa.get(paramInt);
      String str = paramString;
      if (paramString == null)
        str = locala.mText;
      locala.mText = str;
      if (paramd1 != null)
      {
        paramString = paramd1;
        if (paramd1.aSh() == null)
          paramString = locala.jpm;
        locala.jpm = paramString;
      }
      if (paramd2 != null)
      {
        paramString = paramd2;
        if (paramd2.aSh() == null)
          paramString = locala.jpn;
        locala.jpn = paramString;
      }
      refreshView();
      AppMethodBeat.o(87547);
    }
  }

  protected final void a(View paramView, a.a parama)
  {
    int i = 0;
    AppMethodBeat.i(87554);
    ImageView localImageView1 = (ImageView)paramView.findViewById(2131820915);
    TextView localTextView1 = (TextView)paramView.findViewById(2131821393);
    ImageView localImageView2 = (ImageView)paramView.findViewById(2131821394);
    TextView localTextView2 = (TextView)paramView.findViewById(2131820674);
    View localView = paramView.findViewById(2131821395);
    int j;
    if ("top".equals(this.joX))
    {
      paramView.setLayoutParams(new LinearLayout.LayoutParams(0, fromDPToPix(getContext(), 40), 1.0F));
      localImageView1.setVisibility(8);
      localTextView2.setTextSize(1, 14.0F);
      if (parama.jpo)
      {
        localView.setBackgroundColor(this.joZ);
        localView.setVisibility(0);
        paramView = localTextView1.getBackground();
        if (paramView != null)
          paramView.setColorFilter(parama.jpr, PorterDuff.Mode.SRC_ATOP);
        if (!parama.jpq.isEmpty())
          break label524;
        j = 4;
        label171: localTextView1.setVisibility(j);
        localTextView1.setText(parama.jpq);
        localTextView1.setTextColor(parama.jps);
        if (!parama.jpp)
          break label530;
        j = i;
        label206: localImageView2.setVisibility(j);
        if ((!parama.jpo) || (parama.jpn.aSh() == null))
          break label536;
        parama.jpn.a(new a.2(this, localImageView1));
        parama.jpn.aSg();
        label254: localTextView2.setText(parama.mText);
        if (!parama.jpo)
          break label563;
        localTextView2.setTextColor(this.joZ);
        AppMethodBeat.o(87554);
      }
    }
    while (true)
    {
      return;
      localView.setVisibility(4);
      break;
      if (parama.jpm.aSh() != null)
        if (parama.mText != null)
        {
          paramView.setLayoutParams(new LinearLayout.LayoutParams(0, fromDPToPix(getContext(), 54), 1.0F));
          localImageView1.setVisibility(0);
          localImageView1.getLayoutParams().width = fromDPToPix(getContext(), 32);
          localImageView1.getLayoutParams().height = fromDPToPix(getContext(), 28);
          localTextView2.setVisibility(0);
          localTextView2.setTextSize(1, 12.0F);
        }
      while (true)
      {
        localView.setVisibility(4);
        break;
        paramView.setLayoutParams(new LinearLayout.LayoutParams(0, fromDPToPix(getContext(), 48), 1.0F));
        localImageView1.setVisibility(0);
        localImageView1.getLayoutParams().width = fromDPToPix(getContext(), 36);
        localImageView1.getLayoutParams().height = fromDPToPix(getContext(), 36);
        localTextView2.setVisibility(8);
        continue;
        if (parama.mText != null)
        {
          paramView.setLayoutParams(new LinearLayout.LayoutParams(0, fromDPToPix(getContext(), 49), 1.0F));
          localImageView1.setVisibility(8);
          localTextView2.setVisibility(0);
          localTextView2.setTextSize(1, 16.0F);
        }
      }
      label524: j = 0;
      break label171;
      label530: j = 4;
      break label206;
      label536: parama.jpm.a(new a.3(this, localImageView1));
      parama.jpm.aSg();
      break label254;
      label563: localTextView2.setTextColor(this.joY);
      AppMethodBeat.o(87554);
    }
  }

  protected final void aSe()
  {
    AppMethodBeat.i(87553);
    if (this.jpd != null)
      this.jpd.Z(this.jpc, ((a.a)this.jpa.get(this.jpc)).mUrl);
    AppMethodBeat.o(87553);
  }

  public final void av(boolean paramBoolean)
  {
    AppMethodBeat.i(87550);
    int i = getHeight();
    int j;
    ObjectAnimator localObjectAnimator;
    if ("top".equals(this.joX))
    {
      j = -1;
      localObjectAnimator = ObjectAnimator.ofFloat(this, "translationY", new float[] { j * i, 0.0F });
      if (!paramBoolean)
        break label92;
    }
    label92: for (long l = 250L; ; l = 0L)
    {
      localObjectAnimator.setDuration(l);
      post(new a.10(this, localObjectAnimator));
      AppMethodBeat.o(87550);
      return;
      j = 1;
      break;
    }
  }

  protected final void b(Bitmap paramBitmap, ImageView paramImageView)
  {
    AppMethodBeat.i(87555);
    paramImageView.post(new a.4(this, paramImageView, paramBitmap));
    AppMethodBeat.o(87555);
  }

  public final void c(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(87548);
    int i = w.bx(paramString3, 0);
    int j = w.bx(paramString4, -1);
    int k = 0;
    if (k < this.jpa.size())
    {
      if (k == paramInt)
      {
        ((a.a)this.jpa.get(k)).aSf();
        if (!"redDot".equals(paramString1))
          break label90;
        ((a.a)this.jpa.get(k)).jpp = true;
      }
      while (true)
      {
        k++;
        break;
        label90: if ("text".equals(paramString1))
        {
          ((a.a)this.jpa.get(k)).jpq = paramString2;
          ((a.a)this.jpa.get(k)).jpr = i;
          ((a.a)this.jpa.get(k)).jps = j;
        }
        else if ("none".equals(paramString1))
        {
          ((a.a)this.jpa.get(k)).jpp = false;
          ((a.a)this.jpa.get(k)).jpq = "";
        }
      }
    }
    refreshView();
    AppMethodBeat.o(87548);
  }

  public final void fi(boolean paramBoolean)
  {
    AppMethodBeat.i(87549);
    if (!al.isMainThread())
    {
      al.d(new a.8(this, paramBoolean));
      AppMethodBeat.o(87549);
      return;
    }
    int i = getHeight();
    int j;
    label50: ObjectAnimator localObjectAnimator;
    if ("top".equals(this.joX))
    {
      j = -1;
      localObjectAnimator = ObjectAnimator.ofFloat(this, "translationY", new float[] { 0.0F, j * i });
      if (!paramBoolean)
        break label118;
    }
    label118: for (long l = 250L; ; l = 0L)
    {
      localObjectAnimator.setDuration(l);
      a(localObjectAnimator, new a.9(this));
      AppMethodBeat.o(87549);
      break;
      j = 1;
      break label50;
    }
  }

  public final void g(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(87544);
    post(new a.1(this, paramString1, paramString2, paramString3, paramString4));
    AppMethodBeat.o(87544);
  }

  public String getPosition()
  {
    return this.joX;
  }

  public final void h(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(87545);
    a.a locala = new a.a();
    locala.jpm = new b(paramString3, new c()
    {
      public final void a(String paramAnonymousString, d paramAnonymousd)
      {
        AppMethodBeat.i(87534);
        super.a(paramAnonymousString, paramAnonymousd);
        ab.e("IconLoadErrorHandler ", "load icon fail: ".concat(String.valueOf(paramAnonymousString)));
        AppMethodBeat.o(87534);
      }
    });
    locala.jpn = new b(paramString4, new a.6(this));
    locala.mText = paramString2;
    locala.mUrl = paramString1;
    this.jpb.add(new Pair(locala.jpm, locala.jpn));
    if ((locala.mText == null) && ((locala.jpm.aSh() == null) || (locala.jpn.aSh() == null)))
    {
      ab.e("MicroMsg.AppBrandPageTabBar", "illegal data");
      AppMethodBeat.o(87545);
    }
    while (true)
    {
      return;
      paramString1 = (ViewGroup)LayoutInflater.from(getContext()).inflate(2130968739, this.joV, false);
      a(paramString1, locala);
      paramString1.setOnClickListener(new a.7(this));
      this.jpa.add(locala);
      this.joV.addView(paramString1);
      AppMethodBeat.o(87545);
    }
  }

  public final void re(int paramInt)
  {
    AppMethodBeat.i(87546);
    ((a.a)this.jpa.get(this.jpc)).jpo = false;
    if ((paramInt > 0) && (paramInt < this.jpa.size()));
    for (this.jpc = paramInt; ; this.jpc = 0)
    {
      ((a.a)this.jpa.get(this.jpc)).jpo = true;
      refreshView();
      AppMethodBeat.o(87546);
      return;
    }
  }

  public void setClickListener(b paramb)
  {
    this.jpd = paramb;
  }

  public void setPosition(String paramString)
  {
    this.joX = paramString;
  }

  public static abstract interface b
  {
    public abstract void Z(int paramInt, String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.a
 * JD-Core Version:    0.6.2
 */