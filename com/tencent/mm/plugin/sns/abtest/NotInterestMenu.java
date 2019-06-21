package com.tencent.mm.plugin.sns.abtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.ui.v;

public class NotInterestMenu extends LinearLayout
{
  private static int[] qCt = { 2131303656, 2131303654, 2131303655 };
  private Context mContext;
  private n qBY;
  private ListView qCs;
  private NotInterestMenu.c qCu;
  private NotInterestMenu.b qCv;

  public NotInterestMenu(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(35667);
    this.mContext = null;
    this.qBY = null;
    this.qCu = null;
    this.qCv = null;
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(35667);
  }

  public NotInterestMenu(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(35668);
    this.mContext = null;
    this.qBY = null;
    this.qCu = null;
    this.qCv = null;
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(35668);
  }

  private void init()
  {
    AppMethodBeat.i(35669);
    v.hu(this.mContext).inflate(2130970310, this);
    this.qCs = ((ListView)findViewById(2131826365));
    this.qCs.setAdapter(new NotInterestMenu.a(this));
    this.qCs.setOnItemClickListener(new NotInterestMenu.1(this));
    AppMethodBeat.o(35669);
  }

  public void setOnClickMenuListener(NotInterestMenu.b paramb)
  {
    this.qCv = paramb;
  }

  public void setOnSelectMenuItemListener(NotInterestMenu.c paramc)
  {
    this.qCu = paramc;
  }

  public void setSnsInfo(n paramn)
  {
    this.qBY = paramn;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.abtest.NotInterestMenu
 * JD-Core Version:    0.6.2
 */