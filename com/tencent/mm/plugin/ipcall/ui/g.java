package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.ipcall.a.e.d;
import com.tencent.mm.plugin.ipcall.a.g.f;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.pluginsdk.g.a.a.b;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.protocal.protobuf.aqq;
import com.tencent.mm.protocal.protobuf.cru;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.FlowLayout;
import com.tencent.mm.ui.widget.edittext.PasterEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

public final class g extends Dialog
{
  private CharSequence IT;
  private ScrollView hJh;
  View jcl;
  private Activity mActivity;
  private Context mContext;
  private ak mHandler;
  private ArrayList<g.a> mItemList;
  private View.OnClickListener mOnClickListener;
  private int mlt;
  private int mlu;
  private int nCE;
  private int nCF;
  private long nCG;
  private LinearLayout nCH;
  private LinearLayout nCI;
  private RelativeLayout nCJ;
  private RelativeLayout nCK;
  private RelativeLayout nCL;
  private ImageView nCM;
  private ImageView nCN;
  private ImageView nCO;
  private int nCP;
  private FrameLayout nCQ;
  private FlowLayout nCR;
  private Button nCS;
  private Button nCT;
  private PasterEditText nCU;
  private Button nCV;
  private Button nCW;
  private TextView nCX;
  private Animation nCY;
  private int nCZ;
  private int nDa;

  public g(Activity paramActivity, Context paramContext, int paramInt, long paramLong)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(22160);
    this.nCE = 0;
    this.mHandler = new ak();
    this.mOnClickListener = new g.3(this);
    this.mlu = 2130838797;
    this.mlt = 2131690062;
    this.nCZ = 2130838794;
    this.nDa = 2131690693;
    setCancelable(false);
    this.mContext = paramContext;
    this.nCF = paramInt;
    this.nCG = paramLong;
    this.mActivity = paramActivity;
    this.jcl = View.inflate(this.mContext, 2130969896, null);
    this.nCH = ((LinearLayout)this.jcl.findViewById(2131825146));
    this.nCI = ((LinearLayout)this.jcl.findViewById(2131825157));
    this.nCY = AnimationUtils.loadAnimation(ah.getContext(), 2131034125);
    this.nCY.setDuration(200L);
    this.nCY.setStartOffset(100L);
    bIn();
    this.nCJ = ((RelativeLayout)this.jcl.findViewById(2131825147));
    this.nCK = ((RelativeLayout)this.jcl.findViewById(2131825149));
    this.nCL = ((RelativeLayout)this.jcl.findViewById(2131825151));
    this.nCJ.setOnClickListener(this.mOnClickListener);
    this.nCK.setOnClickListener(this.mOnClickListener);
    this.nCL.setOnClickListener(this.mOnClickListener);
    this.nCM = ((ImageView)this.jcl.findViewById(2131825148));
    this.nCN = ((ImageView)this.jcl.findViewById(2131825150));
    this.nCO = ((ImageView)this.jcl.findViewById(2131825152));
    this.nCP = 0;
    xp(this.nCP);
    this.nCV = ((Button)this.jcl.findViewById(2131825160));
    this.nCW = ((Button)this.jcl.findViewById(2131825161));
    this.nCX = ((TextView)this.jcl.findViewById(2131825159));
    paramActivity = c.bIU();
    if (paramActivity != null);
    for (paramActivity = String.format(this.mContext.getString(2131300834), new Object[] { paramActivity.wuA }); ; paramActivity = null)
    {
      if (bo.isNullOrNil(paramActivity))
        this.nCX.setVisibility(4);
      while (true)
      {
        this.nCV.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(22157);
            g.this.dismiss();
            d.a(1, -1, g.h(g.this), g.b(g.this, g.h(g.this)), 1, -1, 1, g.e(g.this), g.f(g.this));
            AppMethodBeat.o(22157);
          }
        });
        this.nCW.setOnClickListener(new g.8(this));
        this.hJh = ((ScrollView)this.jcl.findViewById(2131825145));
        paramActivity = ((ViewGroup)this.mActivity.findViewById(16908290)).getChildAt(0);
        paramActivity.getViewTreeObserver().addOnGlobalLayoutListener(new g.1(this, paramActivity));
        AppMethodBeat.o(22160);
        return;
        this.nCX.setVisibility(0);
        this.nCX.setText(paramActivity);
      }
    }
  }

  private void bIn()
  {
    AppMethodBeat.i(22163);
    this.nCQ = ((FrameLayout)this.jcl.findViewById(2131825153));
    this.nCR = ((FlowLayout)this.jcl.findViewById(2131825154));
    this.nCS = ((Button)this.jcl.findViewById(2131825155));
    this.nCT = ((Button)this.jcl.findViewById(2131825156));
    this.nCU = ((PasterEditText)this.jcl.findViewById(2131822921));
    this.nCS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(22154);
        g.this.dismiss();
        d.a(-1, 1, -1, "", 0, -1, -1, g.e(g.this), g.f(g.this));
        AppMethodBeat.o(22154);
      }
    });
    this.nCT.setOnClickListener(new g.5(this));
    Object localObject1 = com.tencent.mm.plugin.ipcall.a.e.bHj();
    Object localObject2;
    if (((com.tencent.mm.plugin.ipcall.a.e)localObject1).nvw == null)
    {
      ab.i("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource try get cacheResUpdate");
      b.c.dif();
      localObject2 = b.gM(39, 1);
      if (bo.isNullOrNil((String)localObject2))
        break label395;
      localObject2 = com.tencent.mm.a.e.f((String)localObject2, 0, -1);
      if (localObject2 != null)
        ((com.tencent.mm.plugin.ipcall.a.e)localObject1).aX((byte[])localObject2);
    }
    else
    {
      if (((com.tencent.mm.plugin.ipcall.a.e)localObject1).nvw == null)
        break label437;
      localObject2 = ah.getContext().getSharedPreferences(ah.doA(), 0);
      ah.getContext();
      localObject2 = aa.h((SharedPreferences)localObject2);
      if ((!"language_default".equalsIgnoreCase((String)localObject2)) || (Locale.getDefault() == null))
        break label603;
      localObject2 = Locale.getDefault().toString();
    }
    label299: label437: label603: 
    while (true)
    {
      Object localObject3 = ((com.tencent.mm.plugin.ipcall.a.e)localObject1).nvw.iterator();
      Object localObject4;
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (f)((Iterator)localObject3).next();
        if (((String)localObject2).equalsIgnoreCase(((f)localObject4).nzA))
        {
          ab.i("MicroMsg.IPCallFeedbackConfigUpdater", "curLang: %s,resListCount: %s", new Object[] { localObject2, Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.e)localObject1).nvw.size()) });
          localObject2 = localObject4;
        }
      }
      while (true)
        if (localObject2 != null)
        {
          localObject4 = ((f)localObject2).nzB;
          localObject2 = new ArrayList();
          localObject4 = ((ArrayList)localObject4).iterator();
          while (true)
            if (((Iterator)localObject4).hasNext())
            {
              localObject3 = (com.tencent.mm.plugin.ipcall.a.g.e)((Iterator)localObject4).next();
              localObject1 = new g.a();
              ((g.a)localObject1).Id = ((com.tencent.mm.plugin.ipcall.a.g.e)localObject3).Id;
              ((g.a)localObject1).nzz = ((com.tencent.mm.plugin.ipcall.a.g.e)localObject3).nzz;
              ((g.a)localObject1).nDc = false;
              ((ArrayList)localObject2).add(localObject1);
              continue;
              ab.e("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource file not exist");
              break;
              ab.i("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource get cacheResUpdate no filePath");
              break;
              ab.e("MicroMsg.IPCallFeedbackConfigUpdater", "no lanuage equal curLang, curLang: %s,resListCount: %s", new Object[] { localObject2, Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.e)localObject1).nvw.size()) });
              localObject2 = null;
              break label299;
            }
          this.mItemList = ((ArrayList)localObject2);
          localObject3 = this.mItemList.iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject4 = (g.a)((Iterator)localObject3).next();
            localObject1 = this.nCR;
            localObject2 = new TextView(getContext());
            ((TextView)localObject2).setTextSize(0, getContext().getResources().getDimension(2131428407) * a.dm(getContext()));
            ((TextView)localObject2).setBackgroundResource(this.mlu);
            ((TextView)localObject2).setTextColor(this.mContext.getResources().getColor(this.mlt));
            ((TextView)localObject2).setTag(localObject4);
            ((TextView)localObject2).setGravity(17);
            ((TextView)localObject2).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView)localObject2).setSingleLine();
            ((TextView)localObject2).setText(((g.a)localObject4).nzz);
            ((TextView)localObject2).setOnClickListener(new g.6(this));
            ((FlowLayout)localObject1).addView((View)localObject2);
          }
        }
      AppMethodBeat.o(22163);
      return;
    }
  }

  private void xp(int paramInt)
  {
    AppMethodBeat.i(22162);
    this.nCP = paramInt;
    if (paramInt == 0)
    {
      this.nCM.setVisibility(4);
      this.nCN.setVisibility(4);
      this.nCO.setVisibility(4);
      this.nCT.setEnabled(false);
      xs(0);
      AppMethodBeat.o(22162);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
      {
        this.nCM.setVisibility(0);
        this.nCN.setVisibility(4);
        this.nCO.setVisibility(4);
        this.nCT.setEnabled(true);
        xs(1);
        AppMethodBeat.o(22162);
      }
      else if (paramInt == 2)
      {
        this.nCM.setVisibility(0);
        this.nCN.setVisibility(0);
        this.nCO.setVisibility(4);
        this.nCT.setEnabled(true);
        xs(1);
        AppMethodBeat.o(22162);
      }
      else
      {
        if (paramInt == 3)
        {
          this.nCM.setVisibility(0);
          this.nCN.setVisibility(0);
          this.nCO.setVisibility(0);
          this.nCT.setEnabled(true);
          xs(0);
        }
        AppMethodBeat.o(22162);
      }
    }
  }

  private String xq(int paramInt)
  {
    AppMethodBeat.i(22164);
    String str = "";
    Object localObject;
    if (paramInt == 3)
    {
      localObject = "";
      AppMethodBeat.o(22164);
      return localObject;
    }
    if (!bo.isNullOrNil(this.nCU.getText().toString().trim()))
      str = "0";
    if (this.mItemList != null)
    {
      Iterator localIterator = this.mItemList.iterator();
      while (true)
      {
        label66: localObject = str;
        if (!localIterator.hasNext())
          break label147;
        localObject = (g.a)localIterator.next();
        if (!((g.a)localObject).nDc)
          break label156;
        if (!str.equals(""))
          break;
        str = ((g.a)localObject).Id;
      }
      str = str + "_" + ((g.a)localObject).Id;
    }
    label147: label156: 
    while (true)
    {
      break label66;
      localObject = str;
      AppMethodBeat.o(22164);
      break;
    }
  }

  private LinkedList<cru> xr(int paramInt)
  {
    AppMethodBeat.i(22165);
    LinkedList localLinkedList = new LinkedList();
    if (paramInt == 3)
      AppMethodBeat.o(22165);
    while (true)
    {
      return localLinkedList;
      Object localObject1 = this.nCU.getText().toString().trim();
      Object localObject2;
      if (!bo.isNullOrNil((String)localObject1))
      {
        localObject2 = new cru();
        ((cru)localObject2).ID = 0;
        ((cru)localObject2).ncM = ((String)localObject1);
        localLinkedList.add(localObject2);
      }
      if (this.mItemList != null)
      {
        localObject2 = this.mItemList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (g.a)((Iterator)localObject2).next();
          if (((g.a)localObject1).nDc)
          {
            cru localcru = new cru();
            try
            {
              localcru.ID = bo.getInt(((g.a)localObject1).Id, 0);
              localLinkedList.add(localcru);
            }
            catch (NumberFormatException localNumberFormatException)
            {
              ab.e("MicroMsg.IPCallFeedbackDialog", "getFeedbackList error, id = " + ((g.a)localObject1).Id);
            }
          }
        }
      }
      AppMethodBeat.o(22165);
    }
  }

  private void xs(int paramInt)
  {
    AppMethodBeat.i(22168);
    if (paramInt == 0)
    {
      this.nCH.setVisibility(0);
      this.nCI.setVisibility(4);
      if (this.nCE == 1)
      {
        ((LinearLayout.LayoutParams)this.nCQ.getLayoutParams()).height = 0;
        this.nCQ.requestLayout();
      }
      bo.hideVKB(this.jcl);
    }
    while (true)
    {
      this.nCE = paramInt;
      AppMethodBeat.o(22168);
      return;
      if (paramInt == 1)
      {
        this.nCH.setVisibility(0);
        this.nCI.setVisibility(4);
        if (this.nCE == 0)
        {
          ((LinearLayout.LayoutParams)this.nCQ.getLayoutParams()).height = -2;
          this.nCQ.requestLayout();
          this.nCQ.startAnimation(this.nCY);
        }
      }
      else if (paramInt == 2)
      {
        this.nCH.setVisibility(4);
        this.nCI.setVisibility(0);
        bo.hideVKB(this.jcl);
      }
    }
  }

  public final void dismiss()
  {
    AppMethodBeat.i(22167);
    try
    {
      super.dismiss();
      AppMethodBeat.o(22167);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.IPCallFeedbackDialog", "dismiss exception, e = " + localException.getMessage());
        AppMethodBeat.o(22167);
      }
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22161);
    super.onCreate(paramBundle);
    setContentView(this.jcl);
    getWindow().getAttributes().width = getWindow().getWindowManager().getDefaultDisplay().getWidth();
    getWindow().getDecorView().setPadding(0, 0, 0, 0);
    xs(0);
    AppMethodBeat.o(22161);
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null);
    for (this.IT = paramCharSequence; ; this.IT = null)
      return;
  }

  public final void show()
  {
    AppMethodBeat.i(22166);
    super.show();
    AppMethodBeat.o(22166);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.g
 * JD-Core Version:    0.6.2
 */