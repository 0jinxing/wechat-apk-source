package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import java.util.List;
import junit.framework.Assert;

public class ProfileMobilePhoneView extends ProfileItemView
{
  public TextView iDT;
  private Context mContext;
  public String vim;
  public String vin;
  public String[] vio;
  public LinearLayout vix;
  public boolean viy = false;

  public ProfileMobilePhoneView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ProfileMobilePhoneView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ProfileMobilePhoneView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
  }

  @Deprecated
  public final boolean T(ad paramad)
  {
    return false;
  }

  public final boolean cby()
  {
    AppMethodBeat.i(27540);
    Object localObject;
    if (this.iDT != null)
    {
      localObject = this.iDT.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = a.al(getContext(), 2131427668);
      this.iDT.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if (this.vix == null)
    {
      AppMethodBeat.o(27540);
      return false;
    }
    int i;
    if ((!bo.isNullOrNil(this.vim)) && (bo.ant(this.vim).booleanValue()))
    {
      localObject = this.vix.getChildAt(0);
      if (localObject != null)
      {
        ((View)localObject).setVisibility(0);
        ((TextView)localObject).setText(this.vim);
      }
      i = 1;
    }
    int k;
    for (int j = 1; ; j = 0)
    {
      if (bo.isNullOrNil(this.vin))
        break label295;
      this.vio = this.vin.split(",");
      setVisibility(0);
      while (true)
      {
        k = j;
        if (j >= this.vio.length + i)
          break;
        localObject = this.vix.getChildAt(j);
        if (localObject != null)
        {
          ((View)localObject).setVisibility(0);
          ((TextView)localObject).setText(this.vio[(j - i)]);
        }
        j++;
      }
      if ((this.vim != null) && (!bo.ant(this.vim).booleanValue()))
        ab.e("MicroMsg.ProfileMobilePhoneView", "mobile format is error----%s", new Object[] { this.vim });
      i = 0;
    }
    while (true)
      if (k < 5)
      {
        this.vix.getChildAt(k).setVisibility(8);
        k++;
      }
      else
      {
        if ((i != 1) && (bo.isNullOrNil(this.vin)))
          setVisibility(8);
        AppMethodBeat.o(27540);
        break;
        label295: k = j;
      }
  }

  public int getLayout()
  {
    return 2130970408;
  }

  public final void hG(String paramString1, String paramString2)
  {
    AppMethodBeat.i(27539);
    ab.i("MicroMsg.ProfileMobilePhoneView", "phoneNumberByMD5:%s phoneNumberList:%s", new Object[] { paramString1, paramString2 });
    this.vim = paramString1;
    this.vin = paramString2;
    cby();
    AppMethodBeat.o(27539);
  }

  public final void init()
  {
    AppMethodBeat.i(27538);
    this.iDT = ((TextView)findViewById(2131826656));
    this.vix = ((LinearLayout)findViewById(2131826657));
    for (int i = 0; i < 5; i++)
      this.vix.getChildAt(i).setOnClickListener(new ProfileMobilePhoneView.1(this));
    AppMethodBeat.o(27538);
  }

  static final class a extends BaseAdapter
  {
    private Context mContext;
    private List<String> ngC;

    public a(Context paramContext, List<String> paramList)
    {
      AppMethodBeat.i(27534);
      this.ngC = null;
      this.mContext = null;
      if (paramContext != null);
      for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue(bool);
        this.mContext = paramContext;
        this.ngC = paramList;
        AppMethodBeat.o(27534);
        return;
      }
    }

    public final int getCount()
    {
      AppMethodBeat.i(27535);
      int i;
      if (this.ngC == null)
      {
        i = 0;
        AppMethodBeat.o(27535);
      }
      while (true)
      {
        return i;
        i = this.ngC.size();
        AppMethodBeat.o(27535);
      }
    }

    public final Object getItem(int paramInt)
    {
      AppMethodBeat.i(27536);
      Object localObject = this.ngC.get(paramInt);
      AppMethodBeat.o(27536);
      return localObject;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(27537);
      String str = (String)getItem(paramInt);
      View localView;
      if (paramView == null)
      {
        localView = ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(2130969081, paramViewGroup, false);
        paramView = new ProfileMobilePhoneView.a.a(this, (byte)0);
        ((ProfileMobilePhoneView.a.a)paramView).gsf = ((TextView)localView.findViewById(2131820678));
        localView.setTag(paramView);
        paramViewGroup = paramView;
      }
      while (true)
      {
        ((ProfileMobilePhoneView.a.a)paramViewGroup).gsf.setText(str);
        AppMethodBeat.o(27537);
        return localView;
        paramViewGroup = paramView.getTag();
        localView = paramView;
      }
    }

    public final int getViewTypeCount()
    {
      return 2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView
 * JD-Core Version:    0.6.2
 */