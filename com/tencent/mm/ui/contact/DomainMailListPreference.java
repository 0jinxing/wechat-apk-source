package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.Preference;

public class DomainMailListPreference extends Preference
{
  private TextView gne;
  private boolean lyb;
  private String title;
  private String zmo;
  private TextView zmp;
  private TextView zmq;
  private TextView zmr;

  public DomainMailListPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(33699);
    init();
    AppMethodBeat.o(33699);
  }

  public DomainMailListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(33700);
    init();
    AppMethodBeat.o(33700);
  }

  private void init()
  {
    this.lyb = false;
    this.title = "";
    this.zmo = "";
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(33702);
    this.gne = ((TextView)paramView.findViewById(2131820678));
    this.zmp = ((TextView)paramView.findViewById(2131826033));
    this.zmq = ((TextView)paramView.findViewById(2131826034));
    this.zmr = ((TextView)paramView.findViewById(2131826035));
    this.lyb = true;
    if (!this.lyb)
    {
      ab.e("MicroMsg.DomainMailPreference", "initView : unbind view");
      super.onBindView(paramView);
      AppMethodBeat.o(33702);
      return;
    }
    this.gne.setText(ah.nullAsNil(this.title));
    String[] arrayOfString = this.zmo.split(";");
    if (ah.nullAsNil(this.zmo).length() <= 0)
    {
      this.zmp.setVisibility(8);
      this.zmq.setVisibility(8);
    }
    label259: 
    while (true)
    {
      this.zmr.setVisibility(8);
      break;
      if (arrayOfString.length > 0)
      {
        this.zmp.setVisibility(0);
        this.zmp.setText(ah.nullAsNil(arrayOfString[0]));
        label180: if (arrayOfString.length <= 1)
          break label249;
        this.zmq.setVisibility(0);
        this.zmq.setText(ah.nullAsNil(arrayOfString[1]));
      }
      while (true)
      {
        if (arrayOfString.length <= 2)
          break label259;
        this.zmr.setVisibility(0);
        this.zmr.setText(ah.nullAsNil(arrayOfString[2]));
        break;
        this.zmp.setVisibility(8);
        break label180;
        label249: this.zmq.setVisibility(8);
      }
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(33701);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(2131821019);
    localViewGroup.removeAllViews();
    paramViewGroup.inflate(2130970147, localViewGroup);
    AppMethodBeat.o(33701);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.DomainMailListPreference
 * JD-Core Version:    0.6.2
 */