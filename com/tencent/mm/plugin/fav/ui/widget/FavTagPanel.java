package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.d;
import java.util.Iterator;
import java.util.LinkedList;

public class FavTagPanel extends MMTagPanel
{
  private LinkedList<MMTagPanel.d> mpZ;
  private FavTagPanel.a mqa;
  private View.OnClickListener mqb;

  public FavTagPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(74709);
    this.mpZ = new LinkedList();
    this.mqa = null;
    this.mqb = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(74707);
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          FavTagPanel.a(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) == null)
            break label94;
          paramAnonymousView.post(new FavTagPanel.1.1(this, paramAnonymousView));
          AppMethodBeat.o(74707);
        }
        while (true)
        {
          return;
          FavTagPanel.b(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) != null)
            paramAnonymousView.post(new FavTagPanel.1.2(this, paramAnonymousView));
          label94: AppMethodBeat.o(74707);
        }
      }
    };
    AppMethodBeat.o(74709);
  }

  public FavTagPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(74708);
    this.mpZ = new LinkedList();
    this.mqa = null;
    this.mqb = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(74707);
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          FavTagPanel.a(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) == null)
            break label94;
          paramAnonymousView.post(new FavTagPanel.1.1(this, paramAnonymousView));
          AppMethodBeat.o(74707);
        }
        while (true)
        {
          return;
          FavTagPanel.b(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) != null)
            paramAnonymousView.post(new FavTagPanel.1.2(this, paramAnonymousView));
          label94: AppMethodBeat.o(74707);
        }
      }
    };
    AppMethodBeat.o(74708);
  }

  public final void bwC()
  {
  }

  public void setCallBack(FavTagPanel.a parama)
  {
    AppMethodBeat.i(74710);
    this.mqa = parama;
    super.setCallBack(parama);
    AppMethodBeat.o(74710);
  }

  public void setType(String paramString)
  {
    AppMethodBeat.i(74711);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.FavTagPanel", "want to add type, but it is null or empty");
      AppMethodBeat.o(74711);
    }
    while (true)
    {
      return;
      paramString = paramString.trim();
      Object localObject = this.mpZ.iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
          if (paramString.equals(((MMTagPanel.d)((Iterator)localObject).next()).yxM))
          {
            ab.w("MicroMsg.FavTagPanel", "want to add type %s, but it exsited!", new Object[] { paramString });
            AppMethodBeat.o(74711);
            break;
          }
      this.mpZ.clear();
      localObject = dAe();
      this.mpZ.add(localObject);
      a((MMTagPanel.d)localObject, paramString, true);
      ((MMTagPanel.d)localObject).yxN.setOnClickListener(this.mqb);
      removeViews(0, getChildCount() - 1);
      addView(((MMTagPanel.d)localObject).yxN, 0);
      dAf();
      AppMethodBeat.o(74711);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavTagPanel
 * JD-Core Version:    0.6.2
 */