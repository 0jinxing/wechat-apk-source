package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ad;
import com.tencent.mm.plugin.game.d.an;
import com.tencent.mm.plugin.game.d.cy;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public class GameFeedQipaiView extends LinearLayout
  implements View.OnClickListener
{
  private TextView iDT;
  private TextView niH;
  private ImageView niI;
  private LinearLayout niJ;
  private ad niK;

  public GameFeedQipaiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111947);
    if (this.niK == null)
      AppMethodBeat.o(111947);
    while (true)
    {
      return;
      int i;
      if (paramView.getId() == 2131824497)
      {
        if (!bo.isNullOrNil(this.niK.naJ.nbi))
        {
          i = c.ax(getContext(), this.niK.naJ.nbi);
          b.a(getContext(), 10, 1023, 999, i, null, GameIndexListView.getSourceScene(), a.kY(this.niK.mZL));
        }
        AppMethodBeat.o(111947);
      }
      else
      {
        i = ((Integer)paramView.getTag()).intValue();
        if ((i < 0) || (i > this.niK.naJ.mZK.size() - 1))
        {
          AppMethodBeat.o(111947);
        }
        else
        {
          paramView = (an)this.niK.naJ.mZK.get(i);
          if (!bo.isNullOrNil(paramView.mZj))
          {
            int j = c.ax(getContext(), paramView.mZj);
            b.a(getContext(), 10, 1023, i + 1, j, paramView.fKh, GameIndexListView.getSourceScene(), a.kY(this.niK.mZL));
          }
          AppMethodBeat.o(111947);
        }
      }
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111945);
    super.onFinishInflate();
    this.iDT = ((TextView)findViewById(2131820678));
    this.niH = ((TextView)findViewById(2131824497));
    this.niI = ((ImageView)findViewById(2131824210));
    this.niJ = ((LinearLayout)findViewById(2131824498));
    this.niH.setOnClickListener(this);
    AppMethodBeat.o(111945);
  }

  public void setData(d paramd)
  {
    AppMethodBeat.i(111946);
    if ((paramd == null) || (paramd.mVH == null) || (paramd.mVH.naJ == null))
    {
      setVisibility(8);
      AppMethodBeat.o(111946);
    }
    while (true)
    {
      return;
      ad localad = paramd.mVH;
      setVisibility(0);
      this.niK = localad;
      if (!bo.isNullOrNil(localad.naJ.Title))
      {
        this.iDT.setText(localad.naJ.Title);
        this.iDT.setVisibility(0);
        if (bo.isNullOrNil(localad.naJ.naP))
          break label347;
        this.niI.setVisibility(0);
        this.niH.setVisibility(0);
        this.niH.setText(localad.naJ.naP);
      }
      while (true)
      {
        this.niJ.removeAllViews();
        if (bo.ek(localad.naJ.mZK))
          break label368;
        Iterator localIterator = localad.naJ.mZK.iterator();
        while (localIterator.hasNext())
        {
          an localan = (an)localIterator.next();
          Object localObject = LayoutInflater.from(getContext()).inflate(2130969664, this, false);
          ((View)localObject).setOnClickListener(this);
          ((View)localObject).setTag(Integer.valueOf(localad.naJ.mZK.indexOf(localan)));
          this.niJ.addView((View)localObject, new LinearLayout.LayoutParams(-1, -2, 1.0F));
          TextView localTextView1 = (TextView)((View)localObject).findViewById(2131824324);
          ImageView localImageView = (ImageView)((View)localObject).findViewById(2131824325);
          TextView localTextView2 = (TextView)((View)localObject).findViewById(2131824326);
          localObject = (TextView)((View)localObject).findViewById(2131824327);
          localTextView1.setVisibility(8);
          e.bFH().h(localImageView, localan.nbe);
          localTextView2.setText(localan.Title);
          ((TextView)localObject).setText(localan.Desc);
        }
        this.iDT.setVisibility(8);
        break;
        label347: this.niH.setVisibility(8);
        this.niI.setVisibility(8);
      }
      label368: if (!paramd.mVJ)
      {
        a.a(getContext(), 10, 1023, paramd.position, paramd.mVH.fKh, GameIndexListView.getSourceScene(), a.kY(paramd.mVH.mZL));
        paramd.mVJ = true;
      }
      AppMethodBeat.o(111946);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedQipaiView
 * JD-Core Version:    0.6.2
 */