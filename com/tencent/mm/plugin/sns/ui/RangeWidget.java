package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.base.h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RangeWidget extends RelativeLayout
{
  private View contentView;
  private Activity gNy;
  private ImageView rhd;
  SnsUploadConfigView rhg;
  private TextView rke;
  private TextView rmD;
  private boolean rmE;
  private int rmF;
  String rmG;
  private String rmH;
  private String rmI;
  public int style;

  public RangeWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38541);
    this.rmE = true;
    this.rmF = 0;
    this.rmG = "";
    this.rmH = "";
    this.rmI = "";
    this.style = 0;
    init(paramContext);
    AppMethodBeat.o(38541);
  }

  public RangeWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(38540);
    this.rmE = true;
    this.rmF = 0;
    this.rmG = "";
    this.rmH = "";
    this.rmI = "";
    this.style = 0;
    init(paramContext);
    AppMethodBeat.o(38540);
  }

  private static List<String> O(List<String> paramList)
  {
    AppMethodBeat.i(38543);
    LinkedList localLinkedList = new LinkedList();
    g.RQ();
    if (!g.RN().QY())
      AppMethodBeat.o(38543);
    while (true)
    {
      return localLinkedList;
      if (paramList == null)
      {
        AppMethodBeat.o(38543);
      }
      else
      {
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          g.RQ();
          ad localad = ((j)g.K(j.class)).XM().aoO(str);
          paramList = str;
          if (localad != null)
          {
            paramList = str;
            if ((int)localad.ewQ != 0)
              paramList = localad.Oj();
          }
          localLinkedList.add(paramList);
        }
        AppMethodBeat.o(38543);
      }
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(38542);
    this.gNy = ((Activity)paramContext);
    this.contentView = View.inflate(paramContext, getLayoutResource(), this);
    this.rmD = ((TextView)this.contentView.findViewById(2131826814));
    this.rke = ((TextView)this.contentView.findViewById(2131823382));
    this.rhd = ((ImageView)this.contentView.findViewById(2131826813));
    this.contentView.setOnClickListener(new RangeWidget.1(this));
    AppMethodBeat.o(38542);
  }

  public boolean a(int paramInt1, int paramInt2, Intent paramIntent, AtContactWidget paramAtContactWidget)
  {
    AppMethodBeat.i(38544);
    this.rmF = paramIntent.getIntExtra("Ktag_range_index", 0);
    this.rmH = paramIntent.getStringExtra("Klabel_name_list");
    this.rmI = paramIntent.getStringExtra("Kother_user_name_list");
    paramInt1 = getMaxTagNameLen();
    Object localObject = "";
    if (!bo.isNullOrNil(this.rmH))
      localObject = "" + this.rmH;
    paramIntent = (Intent)localObject;
    if (!bo.isNullOrNil(this.rmI))
    {
      paramIntent = bo.c(O(Arrays.asList(this.rmI.split(","))), ",");
      if (((String)localObject).length() > 0)
        paramIntent = (String)localObject + "," + paramIntent;
    }
    else
    {
      localObject = paramIntent;
      if (paramInt1 != -1)
      {
        localObject = paramIntent;
        if (paramIntent != null)
        {
          localObject = paramIntent;
          if (paramIntent.length() > paramInt1)
            localObject = paramIntent.substring(0, paramInt1) + "...";
        }
      }
      paramInt1 = this.rmF;
      if (this.rhd != null)
      {
        this.rhd.setImageDrawable(ah.f(this.gNy, 2131230774, getContext().getResources().getColor(2131690683)));
        this.rke.setTextColor(getResources().getColor(2131690135));
        this.rmD.setTextColor(getResources().getColor(2131690135));
      }
      if (this.rhg != null)
        this.rhg.setPrivated(false);
      switch (paramInt1)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      AppMethodBeat.o(38544);
      return true;
      paramIntent = (String)localObject + paramIntent;
      break;
      if (this.rhd != null)
      {
        this.rhd.setImageDrawable(ah.f(this.gNy, 2131230773, -16777216));
        this.rke.setTextColor(getResources().getColor(2131690316));
        this.rmD.setTextColor(getResources().getColor(2131690164));
      }
      this.rmD.setText(2131303680);
      continue;
      if (this.rhg != null)
        this.rhg.setPrivated(true);
      if ((paramAtContactWidget != null) && (this.rhg != null) && (paramAtContactWidget.getAtList().size() > 0))
      {
        h.g(this.gNy, 2131303805, 2131297061);
        paramAtContactWidget.crA();
        this.rhg.cux();
      }
      this.rmD.setText(2131303678);
      continue;
      this.rmD.setText((CharSequence)localObject);
      continue;
      paramAtContactWidget = this.rmD;
      paramIntent = this.gNy.getString(2131303666);
      String str = paramIntent + "  " + (String)localObject;
      localObject = new SpannableString(str);
      ((SpannableString)localObject).setSpan(new ForegroundColorSpan(-65536), paramIntent.length() + 2, str.length(), 33);
      paramAtContactWidget.setText((CharSequence)localObject);
    }
  }

  public int getLabelRange()
  {
    return this.rmF;
  }

  protected int getLayoutResource()
  {
    return 2130970443;
  }

  protected int getMaxTagNameLen()
  {
    return -1;
  }

  public void setEnablePrivate(boolean paramBoolean)
  {
    this.rmE = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.RangeWidget
 * JD-Core Version:    0.6.2
 */