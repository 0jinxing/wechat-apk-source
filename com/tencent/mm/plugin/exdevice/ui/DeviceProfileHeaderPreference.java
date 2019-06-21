package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class DeviceProfileHeaderPreference extends Preference
{
  private CharSequence JV;
  private String kWC;
  protected MMActivity knn;
  private ImageView lxS;
  private TextView lxT;
  private TextView lxU;
  private TextView lxV;
  private View lxW;
  private TextView lxX;
  private boolean[] lxY;
  private View.OnClickListener[] lxZ;
  private String lya;
  private boolean lyb;
  private String mDeviceName;

  public DeviceProfileHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(19759);
    this.lxY = new boolean[6];
    this.lxZ = new View.OnClickListener[6];
    this.lyb = false;
    this.knn = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(19759);
  }

  public DeviceProfileHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(19760);
    this.lxY = new boolean[6];
    this.lxZ = new View.OnClickListener[6];
    this.lyb = false;
    this.knn = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(19760);
  }

  private void T(View paramView, int paramInt)
  {
    AppMethodBeat.i(19762);
    if (this.lxY[paramInt] != 0);
    for (int i = 8; ; i = 0)
    {
      paramView.setVisibility(i);
      paramView.setOnClickListener(this.lxZ[paramInt]);
      AppMethodBeat.o(19762);
      return;
    }
  }

  public final void Ky(String paramString)
  {
    AppMethodBeat.i(19766);
    this.mDeviceName = paramString;
    if (this.lxV != null)
      this.lxV.setText(paramString);
    AppMethodBeat.o(19766);
  }

  public final void Q(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(19763);
    Object localObject;
    label61: int j;
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(19763);
      return;
    case 0:
      localObject = this.lxS;
      boolean[] arrayOfBoolean = this.lxY;
      if (!paramBoolean)
      {
        j = 1;
        label74: arrayOfBoolean[paramInt] = j;
        if (localObject != null)
          if (!paramBoolean)
            break label157;
      }
      break;
    case 2:
    case 1:
    case 3:
    case 4:
    case 5:
    }
    label157: for (paramInt = i; ; paramInt = 8)
    {
      ((View)localObject).setVisibility(paramInt);
      AppMethodBeat.o(19763);
      break;
      localObject = this.lxT;
      break label61;
      localObject = this.lxU;
      break label61;
      localObject = this.lxV;
      break label61;
      localObject = this.lxW;
      break label61;
      localObject = this.lxX;
      break label61;
      j = 0;
      break label74;
    }
  }

  public final void a(int paramInt, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(19764);
    Object localObject;
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(19764);
      return;
    case 0:
      localObject = this.lxS;
    case 2:
    case 1:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      this.lxZ[paramInt] = paramOnClickListener;
      if (localObject != null)
        ((View)localObject).setOnClickListener(paramOnClickListener);
      AppMethodBeat.o(19764);
      break;
      localObject = this.lxT;
      continue;
      localObject = this.lxU;
      continue;
      localObject = this.lxV;
      continue;
      localObject = this.lxW;
      continue;
      localObject = this.lxX;
    }
  }

  public final void jl(String paramString)
  {
    AppMethodBeat.i(19768);
    this.kWC = paramString;
    if (this.lxS != null)
    {
      c.a locala = new c.a();
      Bitmap localBitmap = d.LV(2130838615);
      paramString = localBitmap;
      if (localBitmap != null)
      {
        paramString = localBitmap;
        if (!localBitmap.isRecycled())
        {
          localBitmap = d.a(localBitmap, true, 0.5F * localBitmap.getWidth());
          paramString = localBitmap;
          if (localBitmap != null)
          {
            paramString = localBitmap;
            if (!localBitmap.isRecycled())
            {
              locala.ePU = new BitmapDrawable(localBitmap);
              paramString = localBitmap;
            }
          }
        }
      }
      if ((paramString == null) || (paramString.isRecycled()))
        locala.ePT = 2130838615;
      locala.eQf = true;
      paramString = locala.ahG();
      o.ahp().a(this.kWC, this.lxS, paramString);
    }
    AppMethodBeat.o(19768);
  }

  public final void jo(String paramString)
  {
    AppMethodBeat.i(19767);
    this.lya = paramString;
    if (this.lxX != null)
      this.lxX.setText(paramString);
    AppMethodBeat.o(19767);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(19761);
    ab.d("MicroMsg.DeviceProfileHeaderPreference", "onBindView");
    this.lxS = ((ImageView)paramView.findViewById(2131823652));
    this.lxT = ((TextView)paramView.findViewById(2131823625));
    this.lxU = ((TextView)paramView.findViewById(2131823654));
    this.lxV = ((TextView)paramView.findViewById(2131823655));
    this.lxW = paramView.findViewById(2131823653);
    this.lxX = ((TextView)paramView.findViewById(2131823656));
    T(this.lxS, 0);
    T(this.lxT, 2);
    T(this.lxU, 1);
    T(this.lxV, 3);
    T(this.lxW, 4);
    T(this.lxX, 5);
    this.lyb = true;
    if (!this.lyb)
      ab.w("MicroMsg.DeviceProfileHeaderPreference", "initView : bindView = " + this.lyb);
    while (true)
    {
      super.onBindView(paramView);
      AppMethodBeat.o(19761);
      return;
      this.lxT.setText(this.JV);
      this.lxV.setText(this.mDeviceName);
      this.lxX.setText(this.lya);
      jl(this.kWC);
    }
  }

  public final void setName(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(19765);
    this.JV = paramCharSequence;
    if (this.lxT != null)
      this.lxT.setText(paramCharSequence);
    AppMethodBeat.o(19765);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.DeviceProfileHeaderPreference
 * JD-Core Version:    0.6.2
 */