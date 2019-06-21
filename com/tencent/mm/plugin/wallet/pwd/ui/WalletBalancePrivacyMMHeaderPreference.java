package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;
import com.tencent.mm.at.p;
import com.tencent.mm.at.p.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.HashMap;
import java.util.Map;

public class WalletBalancePrivacyMMHeaderPreference extends Preference
{
  String cIY;
  String title;
  private int tqN;
  Map<String, p.a> tqO;

  public WalletBalancePrivacyMMHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(46209);
    this.tqO = new HashMap();
    AppMethodBeat.o(46209);
  }

  public WalletBalancePrivacyMMHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(46208);
    this.tqO = new HashMap();
    AppMethodBeat.o(46208);
  }

  public final void fa()
  {
    this.tqN = 2131230765;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(46210);
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(2131828629);
    paramView = (TextView)paramView.findViewById(2131828630);
    if (bo.isNullOrNil(this.cIY))
      if (!bo.gW(this.tqN, 0))
        ((ImageView)localObject).setImageResource(this.tqN);
    while (true)
    {
      if (!bo.isNullOrNil(this.title))
        paramView.setText(this.title);
      AppMethodBeat.o(46210);
      return;
      o.ahk();
      Bitmap localBitmap = c.kR(this.cIY);
      if (localBitmap != null)
      {
        ((ImageView)localObject).setImageBitmap(localBitmap);
      }
      else if (!bo.isNullOrNil(this.cIY))
      {
        localObject = new WalletBalancePrivacyMMHeaderPreference.1(this, (ImageView)localObject);
        this.tqO.put(this.cIY, localObject);
        o.aho().a(this.cIY, (p.a)localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyMMHeaderPreference
 * JD-Core Version:    0.6.2
 */