package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.o;
import com.tencent.mm.bz.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.MaskLayout;

public class BizContactEntranceView extends RelativeLayout
{
  private View kRC;
  private Context mContext;
  private View zlb;
  private TextView zlc;
  TextView zld;
  private boolean zle;
  private boolean zlf;

  public BizContactEntranceView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(33545);
    this.kRC = null;
    this.zle = true;
    this.mContext = paramContext;
    init();
    dHC();
    AppMethodBeat.o(33545);
  }

  public BizContactEntranceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(33544);
    this.kRC = null;
    this.zle = true;
    this.mContext = paramContext;
    init();
    dHC();
    AppMethodBeat.o(33544);
  }

  public BizContactEntranceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(33543);
    this.kRC = null;
    this.zle = true;
    this.mContext = paramContext;
    init();
    dHC();
    AppMethodBeat.o(33543);
  }

  private void init()
  {
    AppMethodBeat.i(33546);
    this.zlf = false;
    View.inflate(getContext(), 2130968854, this);
    this.kRC = findViewById(2131821064);
    this.zlb = this.kRC.findViewById(2131821797);
    Object localObject = this.zlb.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject).height = ((int)(a.am(getContext(), 2131427553) * a.fZ(getContext())));
    this.zlb.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.kRC.setOnClickListener(new BizContactEntranceView.1(this));
    this.zlb.setOnTouchListener(new BizContactEntranceView.2(this));
    MaskLayout localMaskLayout = (MaskLayout)this.zlb.findViewById(2131821798);
    localObject = (ImageView)localMaskLayout.getContentView();
    o.acd();
    ((ImageView)localObject).setImageBitmap(d.qh("service_officialaccounts"));
    this.zlc = ((TextView)localMaskLayout.findViewById(2131821067));
    this.zld = ((TextView)localMaskLayout.findViewById(2131821799));
    AppMethodBeat.o(33546);
  }

  final void dHC()
  {
    AppMethodBeat.i(33547);
    long l = System.currentTimeMillis();
    aw.ZK();
    int i = c.XM().dsw();
    View localView;
    if (i > 0)
    {
      this.zle = true;
      localView = this.zlb;
      if (!this.zle)
        break label129;
    }
    label129: for (int j = 0; ; j = 8)
    {
      localView.setVisibility(j);
      if (this.zle)
        aw.RS().aa(new BizContactEntranceView.3(this));
      ab.i("MicroMsg.BizContactEntranceView", "biz contact Count %d, isEntranceShow %s, setStatus cost %d", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.zle), Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(33547);
      return;
      this.zle = false;
      break;
    }
  }

  public void setVisible(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(33548);
    ab.i("MicroMsg.BizContactEntranceView", "setVisible visible = %s, isEntranceShow = %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.zle) });
    View localView = this.kRC;
    if ((paramBoolean) && (this.zle));
    while (true)
    {
      localView.setVisibility(i);
      AppMethodBeat.o(33548);
      return;
      i = 8;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.BizContactEntranceView
 * JD-Core Version:    0.6.2
 */