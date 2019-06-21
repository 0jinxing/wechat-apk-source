package com.tencent.mm.plugin.sns.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.e;
import com.tencent.mm.plugin.sns.model.u;
import com.tencent.mm.plugin.sns.ui.bb;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class b
  implements e
{
  private boolean cwB;
  Context mContext;
  private int qDY;
  public final int qOK;
  private com.tencent.mm.plugin.sns.ui.d.b qOL;
  private FrameLayout qOM;
  AbsoluteLayout qON;
  protected Animation qOO;
  protected Animation qOP;
  boolean qOQ;
  int[] qOR;
  private int[] qOS;
  private int[] qOT;
  private int[] qOU;
  private int[] qOV;
  Map<Long, b.b> qOW;
  private Map<Long, b.b> qOX;
  private HashSet<Long> qOY;
  h qOZ;
  private HashMap<Long, Boolean> qPa;

  public b(Context paramContext, com.tencent.mm.plugin.sns.ui.d.b paramb, FrameLayout paramFrameLayout)
  {
    AppMethodBeat.i(36770);
    this.qOK = 14;
    this.qON = null;
    this.qOQ = false;
    this.qOR = new int[] { 2131303561, 2131303562, 2131303563, 2131303564 };
    this.qOS = new int[] { 2131230784, 2131230786, 2131230785, 2131230783 };
    this.qOT = this.qOR;
    this.cwB = true;
    this.qOW = new HashMap();
    this.qOX = new HashMap();
    this.qOY = new HashSet();
    this.qOZ = null;
    this.qPa = new HashMap();
    this.qDY = -1;
    g localg = af.cnx();
    h localh1 = new h();
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100007");
    h localh2;
    if (!localc.isValid())
    {
      ab.i("MicroMsg.SnsABTestStrategy", "abtest is invalid");
      localh2 = null;
    }
    while (true)
    {
      localg.qQa = localh2;
      this.qOZ = af.cnx().coB();
      if (this.qOZ != null)
      {
        this.qOU = this.qOZ.qQc;
        if (!this.qOZ.coC())
          this.cwB = false;
      }
      this.mContext = paramContext;
      this.qOL = paramb;
      this.qOM = paramFrameLayout;
      this.qOO = new ScaleAnimation(1.0F, 1.0F, 0.0F, 1.0F, 1, 1.0F, 1, 0.0F);
      this.qOO = AnimationUtils.loadAnimation(paramContext, 2131034160);
      this.qOP = new ScaleAnimation(1.0F, 1.0F, 1.0F, 0.0F, 1, 1.0F, 1, 0.0F);
      this.qOP = AnimationUtils.loadAnimation(paramContext, 2131034161);
      AppMethodBeat.o(36770);
      return;
      Map localMap = localc.dru();
      localh2 = localh1;
      if (localMap != null)
      {
        ab.i("MicroMsg.SnsABTestStrategy", "snsabtest feed " + localc.field_expId + " " + localc.field_layerId + " " + localc.field_startTime + " " + localc.field_endTime);
        localh1.h(localc.field_layerId, localc.field_expId, localMap);
        localh2 = localh1;
      }
    }
  }

  private static String a(a parama, Map<String, String> paramMap)
  {
    AppMethodBeat.i(36773);
    if (parama == null)
    {
      parama = "";
      AppMethodBeat.o(36773);
    }
    while (true)
    {
      return parama;
      label30: StringBuffer localStringBuffer1;
      StringBuffer localStringBuffer2;
      int i;
      label49: char c;
      if (aa.doo())
      {
        parama = parama.qOG;
        localStringBuffer1 = new StringBuffer();
        localStringBuffer2 = new StringBuffer();
        i = 0;
        if (i >= parama.length())
          break label217;
        c = parama.charAt(i);
        if (c != '$')
          break label190;
        if (localStringBuffer2.length() != 0)
          break label115;
        localStringBuffer2.append(c);
      }
      label190: 
      while (true)
      {
        i++;
        break label49;
        if (aa.dop())
        {
          parama = parama.qOH;
          break label30;
        }
        parama = parama.qOI;
        break label30;
        label115: if (localStringBuffer2.charAt(localStringBuffer2.length() - 1) == '$')
        {
          localStringBuffer1.append('$');
          localStringBuffer2 = new StringBuffer();
        }
        else
        {
          String str = (String)paramMap.get(localStringBuffer2.substring(1));
          if (str == null)
          {
            parama = "";
            AppMethodBeat.o(36773);
            break;
          }
          localStringBuffer1.append(str);
          continue;
          if (localStringBuffer2.length() == 0)
            localStringBuffer1.append(c);
          else
            localStringBuffer2.append(c);
        }
      }
      label217: parama = localStringBuffer1.toString();
      AppMethodBeat.o(36773);
    }
  }

  public final void a(int paramInt, String paramString, long paramLong, TimeLineObject paramTimeLineObject, boolean paramBoolean)
  {
    AppMethodBeat.i(36768);
    if ((paramBoolean) && (this.cwB))
    {
      if (this.qOY.contains(Long.valueOf(paramLong)))
      {
        paramBoolean = false;
        if (this.qPa.containsKey(Long.valueOf(paramLong)))
          paramBoolean = ((Boolean)this.qPa.get(Long.valueOf(paramLong))).booleanValue();
        if (paramBoolean)
        {
          paramString = (b.b)this.qOX.get(Long.valueOf(paramLong));
          if (paramString != null)
            paramString.IF();
        }
      }
      this.qOX.remove(Long.valueOf(paramLong));
      this.qOY.remove(Long.valueOf(paramLong));
    }
    AppMethodBeat.o(36768);
  }

  public final void a(int paramInt, String paramString, long paramLong, TimeLineObject paramTimeLineObject, boolean paramBoolean, bb parambb)
  {
    AppMethodBeat.i(36767);
    if ((paramBoolean) && (this.cwB) && (this.qOZ != null) && (parambb != null))
    {
      this.qOY.add(Long.valueOf(paramLong));
      paramString = new b.b(paramLong, this.qOZ.qPm, this.qOZ.qPn, parambb.cuH());
      this.qOX.put(Long.valueOf(paramLong), paramString);
    }
    AppMethodBeat.o(36767);
  }

  final void a(View paramView, AbsoluteLayout paramAbsoluteLayout, com.tencent.mm.plugin.sns.data.b paramb)
  {
    AppMethodBeat.i(36772);
    Object localObject1 = (ViewGroup)paramView;
    ((ViewGroup)localObject1).removeAllViews();
    if (this.qOZ == null)
      AppMethodBeat.o(36772);
    while (true)
    {
      return;
      if ((paramb.qFH != null) && (paramb.qFH.rDm != null))
        break;
      AppMethodBeat.o(36772);
    }
    Object localObject2 = paramb.qFH.rDm;
    int i = 0;
    Paint localPaint = new Paint(1);
    int j = BackwardSupportUtil.b.b(this.mContext, 12.0F);
    int k = BackwardSupportUtil.b.b(this.mContext, 10.0F);
    int m = BackwardSupportUtil.b.b(this.mContext, 150.0F);
    Object localObject3 = new LinkedList();
    float f = BackwardSupportUtil.b.b(this.mContext, 17.0F) * com.tencent.mm.bz.a.dm(this.mContext) + k * 2;
    int n = (int)f;
    for (int i1 = 0; i1 < this.qOZ.qPP.size(); i1++)
    {
      Object localObject4 = (a)this.qOZ.qPP.get(i1);
      TextView localTextView = new TextView(this.mContext);
      localTextView.setPadding(j, k, j, k);
      localTextView.setTextSize(1, 14.0F * com.tencent.mm.bz.a.dm(this.mContext));
      localTextView.setTextColor(this.mContext.getResources().getColor(2131690466));
      localObject4 = a((a)localObject4, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUD);
      localTextView.setText((CharSequence)localObject4);
      localPaint.setTextSize(localTextView.getTextSize());
      ((ViewGroup)localObject1).addView(localTextView);
      i = Math.max(i, (int)localPaint.measureText((String)localObject4) + j * 2);
      localTextView.setTag(Integer.valueOf(i1));
      ((List)localObject3).add(localTextView);
      localTextView.setOnClickListener(new b.3(this, paramb, localTextView));
    }
    ab.i("MicroMsg.AdNotLikeAbTestHelper", "w h " + i + " " + n);
    i1 = i;
    if (i < m)
      i1 = m;
    localObject1 = ((List)localObject3).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (TextView)((Iterator)localObject1).next();
      localObject2 = ((TextView)localObject3).getLayoutParams();
      ((ViewGroup.LayoutParams)localObject2).width = i1;
      ((ViewGroup.LayoutParams)localObject2).height = ((int)f);
      ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    }
    new Rect();
    j = f.fD(this.mContext);
    localObject1 = paramb.qFH.cuI();
    m = BackwardSupportUtil.b.b(this.mContext, 2.0F);
    int i2 = localObject1[0];
    k = localObject1[1];
    int i3 = this.qDY;
    paramb = paramb.qFH;
    if (paramb.rDi != null);
    for (i = paramb.rDi.getHeight(); ; i = 0)
    {
      paramAbsoluteLayout.updateViewLayout(paramView, new AbsoluteLayout.LayoutParams(-2, -2, i2 - i1 - m, k - i3 - j + n - i));
      AppMethodBeat.o(36772);
      break;
    }
  }

  public final void a(b.b paramb)
  {
    AppMethodBeat.i(36769);
    this.qOW.remove(Long.valueOf(paramb.qDh));
    paramb.IF();
    AppMethodBeat.o(36769);
  }

  public final boolean cox()
  {
    boolean bool = false;
    AppMethodBeat.i(36774);
    Object localObject;
    if (this.qON != null)
    {
      if ((this.qON.getTag() instanceof b.a))
      {
        localObject = (b.a)this.qON.getTag();
        localObject = (b.b)this.qOW.get(Long.valueOf(((b.a)localObject).cND));
        if (localObject != null)
        {
          if (!((b.b)localObject).coz())
            break label115;
          if (((b.b)localObject).coy())
            ((b.b)localObject).YA("2:0:");
          a((b.b)localObject);
        }
      }
      this.qOM.removeView(this.qON);
      this.qON = null;
      bool = true;
      AppMethodBeat.o(36774);
    }
    while (true)
    {
      return bool;
      label115: ((b.b)localObject).YA("2:0:");
      a((b.b)localObject);
      break;
      this.qOQ = false;
      AppMethodBeat.o(36774);
    }
  }

  public final int dC(View paramView)
  {
    AppMethodBeat.i(36771);
    if (this.qOQ)
    {
      i = 0;
      AppMethodBeat.o(36771);
    }
    Object localObject1;
    Object localObject2;
    label332: label354: String str1;
    Object localObject3;
    ImageView[] arrayOfImageView;
    int k;
    while (true)
    {
      return i;
      if (this.qON != null)
      {
        if ((this.qON.getTag() instanceof b.a))
        {
          paramView = ((b.a)this.qON.getTag()).qCZ;
          this.qOQ = true;
          paramView.startAnimation(this.qOP);
          this.qOP.setAnimationListener(new b.5(this, paramView));
        }
        while (true)
        {
          i = 0;
          AppMethodBeat.o(36771);
          break;
          cox();
        }
      }
      if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
      {
        i = 0;
        AppMethodBeat.o(36771);
      }
      else if ((!this.cwB) || (this.qOZ == null))
      {
        i = 2;
        AppMethodBeat.o(36771);
      }
      else
      {
        localObject1 = (com.tencent.mm.plugin.sns.data.b)paramView.getTag();
        long l = ((com.tencent.mm.plugin.sns.data.b)localObject1).cND;
        localObject2 = ((com.tencent.mm.plugin.sns.data.b)localObject1).qFH.rDm;
        boolean bool;
        if (this.qPa.containsKey(Long.valueOf(l)))
          bool = ((Boolean)this.qPa.get(Long.valueOf(l))).booleanValue();
        while (true)
        {
          if (bool)
            break label354;
          i = 2;
          AppMethodBeat.o(36771);
          break;
          if (this.qOZ == null)
          {
            bool = false;
          }
          else if (localObject2 == null)
          {
            bool = false;
          }
          else
          {
            for (i = 0; ; i++)
            {
              if (i >= this.qOZ.qPP.size())
                break label332;
              if (bo.isNullOrNil(a((a)this.qOZ.qPP.get(i), ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUD)))
              {
                this.qPa.put(Long.valueOf(l), Boolean.FALSE);
                bool = false;
                break;
              }
            }
            this.qPa.put(Long.valueOf(l), Boolean.TRUE);
            bool = true;
          }
        }
        str1 = ((com.tencent.mm.plugin.sns.data.b)localObject1).cwT;
        localObject2 = new b.b(((com.tencent.mm.plugin.sns.data.b)localObject1).cND, ((com.tencent.mm.plugin.sns.data.b)localObject1).qFH.cuH(), this.qOZ.qPm, this.qOZ.qPn, this.mContext.getString(2131303584));
        this.qOW.put(Long.valueOf(((com.tencent.mm.plugin.sns.data.b)localObject1).cND), localObject2);
        if (this.qOY.contains(Long.valueOf(((com.tencent.mm.plugin.sns.data.b)localObject1).cND)))
          this.qOY.remove(Long.valueOf(((com.tencent.mm.plugin.sns.data.b)localObject1).cND));
        this.qON = new AbsoluteLayout(this.mContext);
        this.qON.setId(2131820733);
        new FrameLayout.LayoutParams(-1, -1);
        this.qOM.addView(this.qON);
        localObject2 = v.hu(this.mContext).inflate(2130968634, null);
        localObject3 = new TextView[3];
        arrayOfImageView = new ImageView[3];
        localObject3[0] = ((TextView)((View)localObject2).findViewById(2131821036));
        localObject3[1] = ((TextView)((View)localObject2).findViewById(2131821038));
        localObject3[2] = ((TextView)((View)localObject2).findViewById(2131821040));
        arrayOfImageView[0] = ((ImageView)((View)localObject2).findViewById(2131821037));
        arrayOfImageView[1] = ((ImageView)((View)localObject2).findViewById(2131821039));
        arrayOfImageView[2] = ((ImageView)((View)localObject2).findViewById(2131821041));
        j = 0;
        i = 0;
        if (!u.kj(((com.tencent.mm.plugin.sns.data.b)localObject1).cND))
        {
          k = 0;
          while (true)
          {
            j = i;
            if (k >= this.qOU.length)
              break;
            j = i;
            if (this.qOU[k] == 3)
              j = i + 1;
            k++;
            i = j;
          }
        }
        m = 0;
        k = 0;
        while (k < this.qOU.length)
        {
          i = m;
          if (this.qOU[k] == 0)
            i = m + 1;
          k++;
          m = i;
        }
        if (m + j <= 0)
          break label837;
        i = this.qOU.length - m - j;
        if (i != 0)
          break;
        i = 2;
        AppMethodBeat.o(36771);
      }
    }
    label837: for (this.qOV = new int[i]; ; this.qOV = new int[this.qOU.length])
    {
      m = 0;
      for (i = 0; m < this.qOU.length; i = k)
      {
        k = i;
        if (this.qOU[m] != 0)
          if (j > 0)
          {
            k = i;
            if (this.qOU[m] == 3);
          }
          else
          {
            this.qOV[i] = this.qOU[m];
            k = i + 1;
          }
        m++;
      }
    }
    if (u.ki(((com.tencent.mm.plugin.sns.data.b)localObject1).cND))
    {
      i = 0;
      if (i < this.qOV.length)
      {
        if (this.qOV[i] != 3)
          break label1145;
        this.qOV[i] = 4;
      }
    }
    int i = 0;
    int m = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 12);
    int n = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 8);
    int i1 = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 12);
    int j = 0;
    label927: int i2;
    int i3;
    if (j < this.qOV.length)
    {
      i2 = this.qOV[j];
      i3 = this.qOV[j] - 1;
      localObject3[j].setText(this.qOT[i3]);
      Object localObject4 = localObject3[j];
      Paint localPaint = new Paint();
      String str2 = localObject4.getText().toString();
      localPaint.setTextSize(localObject4.getTextSize());
      k = (int)localPaint.measureText(str2, 0, str2.length()) + (m * 2 + n * 2 + i1);
      if (k <= i)
        break label1467;
      i = k;
    }
    label1467: 
    while (true)
    {
      localObject3[j].setCompoundDrawablePadding(com.tencent.mm.bz.a.fromDPToPix(this.mContext, 8));
      localObject3[j].setCompoundDrawablesWithIntrinsicBounds(this.mContext.getResources().getDrawable(this.qOS[i3]), null, null, null);
      if (i3 == 1)
        arrayOfImageView[j].setVisibility(0);
      while (true)
      {
        localObject3[j].setTag(localObject1);
        localObject3[j].setOnClickListener(new b.1(this, i2, (com.tencent.mm.plugin.sns.data.b)localObject1, (View)localObject2, paramView));
        j++;
        break label927;
        label1145: i++;
        break;
        arrayOfImageView[j].setVisibility(8);
      }
      for (j = 0; j < this.qOV.length; j++)
        localObject3[j].setMaxWidth(i);
      for (j = this.qOV.length; j < 3; j++)
        localObject3[j].setVisibility(8);
      new Rect();
      j = f.fD(this.mContext);
      localObject3 = ((com.tencent.mm.plugin.sns.data.b)localObject1).qFH.cuI();
      ab.d("MicroMsg.AdNotLikeAbTestHelper", "addCommentView getLocationInWindow " + localObject3[0] + "  " + localObject3[1] + " height: " + j);
      m = i + com.tencent.mm.bz.a.fromDPToPix(this.mContext, 12);
      i = BackwardSupportUtil.b.b(this.mContext, 17.0F);
      k = BackwardSupportUtil.b.b(this.mContext, 2.0F);
      this.qDY = ae.hA(this.mContext);
      localObject3 = new AbsoluteLayout.LayoutParams(m, -2, localObject3[0] - m - k, localObject3[1] - this.qDY - j + i);
      localObject1 = new b.a(this, str1, (View)localObject2, ((com.tencent.mm.plugin.sns.data.b)localObject1).cND, ((com.tencent.mm.plugin.sns.data.b)localObject1).qFH.rDm);
      this.qON.setTag(localObject1);
      this.qON.addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
      ((View)localObject2).setVisibility(8);
      this.qOQ = true;
      new ak().post(new b.2(this, paramView, (View)localObject2));
      i = 1;
      AppMethodBeat.o(36771);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.b
 * JD-Core Version:    0.6.2
 */