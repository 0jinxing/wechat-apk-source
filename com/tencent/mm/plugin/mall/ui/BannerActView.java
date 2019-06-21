package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.mall.a;
import com.tencent.mm.plugin.wallet_core.model.mall.b;
import com.tencent.mm.plugin.wallet_core.model.u;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public class BannerActView extends LinearLayout
{
  private List<a> olh;
  private u oli;
  private TextView olj;

  public BannerActView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(43128);
    this.olj = ((TextView)LayoutInflater.from(getContext()).inflate(2130968831, this, true).findViewById(2131821702));
    setOnClickListener(new BannerActView.1(this));
    AppMethodBeat.o(43128);
  }

  public void setActivityList(List<a> paramList)
  {
    AppMethodBeat.i(43130);
    this.olh = paramList;
    if ((this.olh == null) || (this.olh.size() <= 0))
      ab.i("MicroMsg.BannerActivityView", "func[setActivityList] actList null");
    while (true)
    {
      setVisibility(8);
      AppMethodBeat.o(43130);
      while (true)
      {
        return;
        if (!b.dS(this.olh))
          break;
        this.olj.setText(((a)this.olh.get(0)).tDj);
        setVisibility(0);
        AppMethodBeat.o(43130);
      }
    }
  }

  public void setData(u paramu)
  {
    AppMethodBeat.i(43129);
    this.oli = paramu;
    if (this.oli != null)
    {
      this.olj.setText(this.oli.field_bulletin_content);
      setVisibility(0);
      AppMethodBeat.o(43129);
    }
    while (true)
    {
      return;
      setVisibility(8);
      AppMethodBeat.o(43129);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.BannerActView
 * JD-Core Version:    0.6.2
 */