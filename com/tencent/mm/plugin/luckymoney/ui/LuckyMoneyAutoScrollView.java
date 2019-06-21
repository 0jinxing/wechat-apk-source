package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public class LuckyMoneyAutoScrollView extends RelativeLayout
  implements LuckyMoneyAutoScrollItem.b
{
  private View contentView;
  private Context mContext;
  private RelativeLayout och;
  private RelativeLayout oci;
  private RelativeLayout ocj;
  LuckyMoneyAutoScrollItem ock;
  LuckyMoneyAutoScrollItem ocl;
  LuckyMoneyAutoScrollItem ocm;
  private RelativeLayout ocn;
  private RelativeLayout oco;
  private RelativeLayout ocp;
  ImageView ocq;
  ImageView ocr;
  ImageView ocs;
  private String oct;
  private String ocu;
  private String ocv;
  boolean ocw;
  private LuckyMoneyAutoScrollView.a ocx;

  public LuckyMoneyAutoScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public LuckyMoneyAutoScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(42570);
    this.oct = "0";
    this.ocu = "0";
    this.ocv = "0";
    this.ocw = false;
    this.mContext = paramContext;
    paramContext = LayoutInflater.from(this.mContext).inflate(2130969967, this);
    this.contentView = paramContext;
    this.ock = ((LuckyMoneyAutoScrollItem)paramContext.findViewById(2131825382));
    this.ocl = ((LuckyMoneyAutoScrollItem)paramContext.findViewById(2131825386));
    this.ocm = ((LuckyMoneyAutoScrollItem)paramContext.findViewById(2131825390));
    s.o(this.ock, 2);
    s.o(this.ocl, 2);
    s.o(this.ocm, 2);
    this.ocn = ((RelativeLayout)paramContext.findViewById(2131825383));
    this.oco = ((RelativeLayout)paramContext.findViewById(2131825387));
    this.ocp = ((RelativeLayout)paramContext.findViewById(2131825391));
    this.ocq = ((ImageView)paramContext.findViewById(2131825380));
    this.ocr = ((ImageView)paramContext.findViewById(2131825385));
    this.ocs = ((ImageView)paramContext.findViewById(2131825389));
    this.och = ((RelativeLayout)paramContext.findViewById(2131825381));
    this.oci = ((RelativeLayout)paramContext.findViewById(2131825384));
    this.ocj = ((RelativeLayout)paramContext.findViewById(2131825388));
    AppMethodBeat.o(42570);
  }

  public final void a(LuckyMoneyAutoScrollView.a parama)
  {
    AppMethodBeat.i(42572);
    this.ocx = parama;
    al.d(new LuckyMoneyAutoScrollView.1(this));
    AppMethodBeat.o(42572);
  }

  public final void aQe()
  {
    AppMethodBeat.i(42574);
    if (!this.ocw)
    {
      this.ocw = true;
      al.d(new LuckyMoneyAutoScrollView.2(this));
    }
    AppMethodBeat.o(42574);
  }

  public final void bMn()
  {
    AppMethodBeat.i(42573);
    this.ock.setVisibility(8);
    this.ocl.setVisibility(8);
    this.ocm.setVisibility(8);
    this.ocq.setVisibility(0);
    this.ocr.setVisibility(0);
    this.ocs.setVisibility(0);
    AppMethodBeat.o(42573);
  }

  public final void eu(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(42575);
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.contentView.getLayoutParams();
      localLayoutParams.height = paramInt2;
      this.contentView.setLayoutParams(localLayoutParams);
      this.contentView.invalidate();
      localLayoutParams = (LinearLayout.LayoutParams)this.och.getLayoutParams();
      localLayoutParams.height = paramInt2;
      localLayoutParams.width = paramInt1;
      this.och.setLayoutParams(localLayoutParams);
      this.och.invalidate();
      localLayoutParams = (LinearLayout.LayoutParams)this.oci.getLayoutParams();
      localLayoutParams.height = paramInt2;
      localLayoutParams.width = paramInt1;
      this.oci.setLayoutParams(localLayoutParams);
      this.oci.invalidate();
      localLayoutParams = (LinearLayout.LayoutParams)this.ocj.getLayoutParams();
      localLayoutParams.height = paramInt2;
      localLayoutParams.width = paramInt1;
      localLayoutParams.leftMargin = 0;
      this.ocj.setLayoutParams(localLayoutParams);
      this.ocj.invalidate();
    }
    AppMethodBeat.o(42575);
  }

  public void setFinalText(String paramString)
  {
    AppMethodBeat.i(42571);
    ab.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: setting text: %s", new Object[] { paramString });
    this.oct = paramString.substring(0, 1);
    this.ocu = paramString.substring(2, 3);
    this.ocv = paramString.substring(3, 4);
    this.ock.setFinalNumber(bo.getInt(this.oct, 0));
    this.ocl.setFinalNumber(bo.getInt(this.ocu, 0));
    this.ocm.setFinalNumber(bo.getInt(this.ocv, 0));
    this.ocq.setImageResource(((Integer)LuckyMoneyAutoScrollItem.ocb.get(bo.getInt(this.oct, 0))).intValue());
    this.ocr.setImageResource(((Integer)LuckyMoneyAutoScrollItem.ocb.get(bo.getInt(this.ocu, 0))).intValue());
    this.ocs.setImageResource(((Integer)LuckyMoneyAutoScrollItem.ocb.get(bo.getInt(this.ocv, 0))).intValue());
    this.ocq.setVisibility(4);
    this.ocr.setVisibility(4);
    this.ocs.setVisibility(4);
    this.ock.setOnScrollEndListener(this);
    this.ocl.setOnScrollEndListener(this);
    this.ocm.setOnScrollEndListener(this);
    ab.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: first: %s, second :%s, third: %s", new Object[] { this.oct, this.ocu, this.ocv });
    AppMethodBeat.o(42571);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView
 * JD-Core Version:    0.6.2
 */