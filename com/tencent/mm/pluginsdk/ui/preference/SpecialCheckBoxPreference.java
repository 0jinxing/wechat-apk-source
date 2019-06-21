package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class SpecialCheckBoxPreference extends Preference
{
  private boolean cEH;
  private boolean ehL;
  private String ehq;
  private boolean eif;
  private ad ldh;
  private Context mContext;
  private CompoundButton.OnCheckedChangeListener vrA;
  private ToggleButton vrx;
  private ToggleButton vry;
  private ToggleButton vrz;

  public SpecialCheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(28124);
    this.vrA = new SpecialCheckBoxPreference.1(this);
    this.eif = false;
    this.mContext = paramContext;
    AppMethodBeat.o(28124);
  }

  public SpecialCheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(28125);
    this.vrA = new SpecialCheckBoxPreference.1(this);
    this.eif = false;
    this.mContext = paramContext;
    AppMethodBeat.o(28125);
  }

  private boolean dle()
  {
    boolean bool1 = false;
    AppMethodBeat.i(28127);
    boolean bool2;
    if (this.cEH)
      if (this.ldh.dua == 0)
      {
        bool2 = true;
        this.eif = bool2;
        label32: if (!(this.mContext instanceof MMActivity))
          break label119;
        if (!this.eif)
          break label96;
        ((MMActivity)this.mContext).setTitleMuteIconVisibility(0);
        AppMethodBeat.o(28127);
        bool2 = true;
      }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      if (this.ehL)
        break label32;
      this.eif = this.ldh.DX();
      break label32;
      label96: ((MMActivity)this.mContext).setTitleMuteIconVisibility(8);
      AppMethodBeat.o(28127);
      bool2 = bool1;
      continue;
      label119: AppMethodBeat.o(28127);
      bool2 = bool1;
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(28126);
    super.onBindView(paramView);
    this.vrx = ((ToggleButton)paramView.findViewById(2131826016));
    this.vry = ((ToggleButton)paramView.findViewById(2131826017));
    this.vrz = ((ToggleButton)paramView.findViewById(2131826018));
    this.ehq = ((MMActivity)this.mContext).getIntent().getStringExtra("RoomInfo_Id");
    this.cEH = ((MMActivity)this.mContext).getIntent().getBooleanExtra("Is_Chatroom", true);
    this.ehL = ((MMActivity)this.mContext).getIntent().getBooleanExtra("Is_Lbsroom", false);
    aw.ZK();
    this.ldh = c.XM().aoO(this.ehq);
    if (this.ldh != null)
    {
      paramView = this.vrx;
      aw.ZK();
      paramView.setChecked(c.XR().aph(this.ldh.field_username));
      this.vrz.setChecked(a.jh(this.ldh.field_type));
      this.vry.setChecked(dle());
    }
    this.vrx.setOnCheckedChangeListener(this.vrA);
    this.vry.setOnCheckedChangeListener(this.vrA);
    this.vrz.setOnCheckedChangeListener(this.vrA);
    AppMethodBeat.o(28126);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.SpecialCheckBoxPreference
 * JD-Core Version:    0.6.2
 */