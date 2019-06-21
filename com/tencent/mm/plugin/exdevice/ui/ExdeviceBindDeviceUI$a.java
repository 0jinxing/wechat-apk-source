package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.asr;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

final class ExdeviceBindDeviceUI$a extends BaseAdapter
{
  private c lyr;
  List<ExdeviceBindDeviceUI.f> lzl;
  private String lzm;
  private ExdeviceBindDeviceUI.e lzn;
  private String lzo;

  public ExdeviceBindDeviceUI$a(String paramString1, ExdeviceBindDeviceUI.e parame, String paramString2)
  {
    AppMethodBeat.i(19837);
    this.lzm = paramString1;
    this.lzn = parame;
    this.lzo = paramString2;
    this.lzl = new ArrayList();
    paramString1 = new c.a();
    paramString1.ePV = 2131690439;
    this.lyr = paramString1.ahG();
    AppMethodBeat.o(19837);
  }

  private int KD(String paramString)
  {
    AppMethodBeat.i(19845);
    int i = 0;
    if (i < this.lzl.size())
      if (((ExdeviceBindDeviceUI.f)this.lzl.get(i)).getKey().compareTo(paramString) == 0)
        AppMethodBeat.o(19845);
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
      AppMethodBeat.o(19845);
    }
  }

  private static boolean KE(String paramString)
  {
    AppMethodBeat.i(19848);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      bool = true;
      AppMethodBeat.o(19848);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(19848);
    }
  }

  public final boolean KB(String paramString)
  {
    AppMethodBeat.i(19840);
    boolean bool;
    if (KD(paramString) >= 0)
    {
      bool = true;
      AppMethodBeat.o(19840);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(19840);
    }
  }

  public final ExdeviceBindDeviceUI.f KC(String paramString)
  {
    AppMethodBeat.i(19841);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(19841);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      for (int i = 0; ; i++)
      {
        if (i >= this.lzl.size())
          break label94;
        ExdeviceBindDeviceUI.f localf = (ExdeviceBindDeviceUI.f)this.lzl.get(i);
        if ((!KE(localf.bpF())) && (paramString.equalsIgnoreCase(localf.bpF())))
        {
          AppMethodBeat.o(19841);
          paramString = localf;
          break;
        }
      }
      label94: AppMethodBeat.o(19841);
      paramString = null;
    }
  }

  public final boolean b(ExdeviceBindDeviceUI.f paramf)
  {
    AppMethodBeat.i(19839);
    boolean bool;
    if (KD(paramf.getKey()) < 0)
    {
      bool = false;
      AppMethodBeat.o(19839);
    }
    while (true)
    {
      return bool;
      paramf.lzx = c(paramf);
      bool = true;
      AppMethodBeat.o(19839);
    }
  }

  final void bpE()
  {
    AppMethodBeat.i(19838);
    for (int i = 0; i < this.lzl.size(); i++)
    {
      ExdeviceBindDeviceUI.f localf = (ExdeviceBindDeviceUI.f)this.lzl.get(i);
      localf.lzx = c(localf);
    }
    AppMethodBeat.o(19838);
  }

  final boolean c(ExdeviceBindDeviceUI.f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(19847);
    if (paramf.lzC == null)
      AppMethodBeat.o(19847);
    while (true)
    {
      return bool;
      if (this.lzn == ExdeviceBindDeviceUI.e.lzv)
      {
        if ((paramf.lzC.wwm == null) || (paramf.lzC.wwm.compareTo(this.lzm) != 0))
          AppMethodBeat.o(19847);
        else if ((paramf.lzC.wwv == null) || (paramf.lzC.wwv.compareTo(this.lzo) != 0))
          AppMethodBeat.o(19847);
      }
      else if (this.lzn == ExdeviceBindDeviceUI.e.lzu)
      {
        if (paramf.lzC.dFp == 0)
          AppMethodBeat.o(19847);
      }
      else
      {
        Assert.assertTrue(false);
        AppMethodBeat.o(19847);
        continue;
        bool = true;
        AppMethodBeat.o(19847);
      }
    }
  }

  final int dV(String paramString1, String paramString2)
  {
    AppMethodBeat.i(19846);
    int i = 0;
    Object localObject;
    String str;
    if (i < this.lzl.size())
    {
      localObject = (ExdeviceBindDeviceUI.f)this.lzl.get(i);
      if (((ExdeviceBindDeviceUI.f)localObject).lzB != null)
      {
        str = ((ExdeviceBindDeviceUI.f)localObject).lzB.vIk;
        label54: if (((ExdeviceBindDeviceUI.f)localObject).lzB == null)
          break label144;
        localObject = ((ExdeviceBindDeviceUI.f)localObject).lzB.jBE;
        label72: if ((KE(str)) || (KE((String)localObject)) || (paramString1.compareTo(str) != 0) || (paramString2.compareTo((String)localObject) != 0))
          break label174;
        AppMethodBeat.o(19846);
      }
    }
    while (true)
    {
      return i;
      if (((ExdeviceBindDeviceUI.f)localObject).lzy == ExdeviceBindDeviceUI.b.lzp)
      {
        str = ((ExdeviceBindDeviceUI.f)localObject).lzA.lxI;
        break label54;
      }
      str = null;
      break label54;
      label144: if (((ExdeviceBindDeviceUI.f)localObject).lzy == ExdeviceBindDeviceUI.b.lzp)
      {
        localObject = ((ExdeviceBindDeviceUI.f)localObject).lzA.lsu;
        break label72;
      }
      localObject = null;
      break label72;
      label174: i++;
      break;
      i = -1;
      AppMethodBeat.o(19846);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(19842);
    int i = 0;
    int k;
    for (int j = 0; i < this.lzl.size(); j = k)
    {
      k = j;
      if (((ExdeviceBindDeviceUI.f)this.lzl.get(i)).lzx)
        k = j + 1;
      i++;
    }
    AppMethodBeat.o(19842);
    return j;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(19844);
    ExdeviceBindDeviceUI.f localf = uO(paramInt);
    ExdeviceBindDeviceUI.a.a locala;
    View localView;
    if (paramView == null)
    {
      locala = new ExdeviceBindDeviceUI.a.a((byte)0);
      localView = View.inflate(paramViewGroup.getContext(), 2130969412, null);
      locala.gxi = ((TextView)localView.findViewById(2131823625));
      locala.iqT = ((ImageView)localView.findViewById(2131823624));
      localView.setTag(locala);
    }
    while ((localf == null) || (localf.lzC == null))
    {
      Assert.assertTrue(false);
      AppMethodBeat.o(19844);
      return localView;
      locala = (ExdeviceBindDeviceUI.a.a)paramView.getTag();
      localView = paramView;
    }
    String str;
    if (localf.lzy == ExdeviceBindDeviceUI.b.lzq)
    {
      ab.d("MicroMsg.ExdeviceBindDeviceUI", "position(%s), broadcastname(%s), mac(%s), deviceTitle(%s).", new Object[] { Integer.valueOf(paramInt), localf.lzz.lzs, localf.lzz.cbq, localf.lzC.wwt });
      str = "";
      paramView = localf.lzC.dFt;
      if ((paramView != null) && (paramView.length() >= 4))
      {
        paramView = paramView.substring(paramView.length() - 4, paramView.length());
        label220: str = localf.lzC.wwt + " " + paramView;
        paramView = new SpannableString(str);
        paramView.setSpan(new ForegroundColorSpan(paramViewGroup.getContext().getResources().getColor(2131690164)), localf.lzC.wwt.length() + 1, str.length(), 17);
        locala.gxi.setText(paramView);
      }
    }
    while (true)
    {
      paramView = localf.lzC.IconUrl;
      if (!KE(paramView))
        o.ahp().a(paramView, locala.iqT, this.lyr);
      AppMethodBeat.o(19844);
      break;
      paramView = str;
      if (localf.lzz.cbq == null)
        break label220;
      paramView = str;
      if (localf.lzz.cbq.length() < 4)
        break label220;
      paramView = localf.lzz.cbq;
      paramView = paramView.substring(paramView.length() - 4, paramView.length());
      break label220;
      if (localf.lzy == ExdeviceBindDeviceUI.b.lzp)
      {
        str = "";
        paramView = localf.lzC.dFt;
        if ((paramView != null) && (paramView.length() >= 4))
          paramView = paramView.substring(paramView.length() - 4, paramView.length());
        while (true)
        {
          str = localf.lzC.wwt + " " + paramView;
          paramView = new SpannableString(str);
          paramView.setSpan(new ForegroundColorSpan(paramViewGroup.getContext().getResources().getColor(2131690164)), localf.lzC.wwt.length() + 1, str.length(), 17);
          locala.gxi.setText(paramView);
          break;
          paramView = str;
          if (localf.lzC.vKF != null)
          {
            paramView = str;
            if (localf.lzC.vKF.length() >= 4)
            {
              paramView = localf.lzC.vKF;
              paramView = paramView.substring(paramView.length() - 4, paramView.length());
            }
          }
        }
      }
      Assert.assertTrue(false);
    }
  }

  public final ExdeviceBindDeviceUI.f uO(int paramInt)
  {
    AppMethodBeat.i(19843);
    int i = -1;
    int j = 0;
    int k;
    ExdeviceBindDeviceUI.f localf;
    if (j < this.lzl.size())
    {
      k = i;
      if (((ExdeviceBindDeviceUI.f)this.lzl.get(j)).lzx)
        k = i + 1;
      if (k == paramInt)
      {
        localf = (ExdeviceBindDeviceUI.f)this.lzl.get(j);
        AppMethodBeat.o(19843);
      }
    }
    while (true)
    {
      return localf;
      j++;
      i = k;
      break;
      localf = null;
      AppMethodBeat.o(19843);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI.a
 * JD-Core Version:    0.6.2
 */