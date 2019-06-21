package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bv;
import org.xwalk.core.Log;

public class ProfileDescribeView extends ProfileItemView
{
  public TextView vik;
  public TextView vil;

  public ProfileDescribeView(Context paramContext)
  {
    super(paramContext);
  }

  public ProfileDescribeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ProfileDescribeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final boolean cby()
  {
    boolean bool = false;
    AppMethodBeat.i(27508);
    Object localObject1;
    if (this.vil != null)
    {
      localObject1 = this.vil.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = com.tencent.mm.bz.a.al(getContext(), 2131427668);
      this.vil.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
    if (this.ldh == null)
    {
      setVisibility(8);
      AppMethodBeat.o(27508);
    }
    while (true)
    {
      return bool;
      String str = this.ldh.dul;
      int i;
      if (!bo.isNullOrNil(this.ldh.dum))
        i = 1;
      while (true)
        if (com.tencent.mm.n.a.jh(this.ldh.field_type))
        {
          if ((!bo.isNullOrNil(str)) && (i != 0))
          {
            localObject2 = getContext().getResources().getDrawable(2131231060);
            ((Drawable)localObject2).setBounds(0, 0, ((Drawable)localObject2).getIntrinsicWidth(), ((Drawable)localObject2).getIntrinsicHeight());
            localObject1 = new com.tencent.mm.ui.widget.a((Drawable)localObject2);
            ((com.tencent.mm.ui.widget.a)localObject1).zLT = ((int)((((Drawable)localObject2).getIntrinsicHeight() - this.vik.getTextSize()) / 2.0F));
            localObject2 = new SpannableString("  ".concat(String.valueOf(str)));
            ((SpannableString)localObject2).setSpan(localObject1, 0, 1, 33);
            this.vik.setText(j.b(getContext(), (CharSequence)localObject2, this.vik.getTextSize()));
            AppMethodBeat.o(27508);
            bool = true;
            break;
            i = 0;
            continue;
          }
          if ((!bo.isNullOrNil(str)) && (i == 0))
          {
            this.vik.setText(j.b(getContext(), bo.nullAsNil(str), this.vik.getTextSize()));
            AppMethodBeat.o(27508);
            bool = true;
            break;
          }
          if ((bo.isNullOrNil(str)) && (i != 0))
          {
            localObject2 = getContext().getResources().getDrawable(2131231060);
            ((Drawable)localObject2).setBounds(0, 0, ((Drawable)localObject2).getIntrinsicWidth(), ((Drawable)localObject2).getIntrinsicHeight());
            localObject1 = new com.tencent.mm.ui.widget.a((Drawable)localObject2);
            ((com.tencent.mm.ui.widget.a)localObject1).zLT = ((int)((((Drawable)localObject2).getIntrinsicHeight() - this.vik.getTextSize()) / 2.0F));
            localObject2 = new SpannableString("  " + getContext().getString(2131298649));
            ((SpannableString)localObject2).setSpan(localObject1, 0, 1, 33);
            this.vik.setText(j.b(getContext(), (CharSequence)localObject2, this.vik.getTextSize()));
            AppMethodBeat.o(27508);
            bool = true;
            break;
          }
          if ((bo.isNullOrNil(str)) && (i == 0))
          {
            Log.i("MicroMsg.ProfileDescribeView", "ProfileDescribeView gone,isContact");
            setVisibility(8);
            AppMethodBeat.o(27508);
            break;
          }
          Log.i("MicroMsg.ProfileDescribeView", "ProfileDescribeView gone,isContact");
          setVisibility(8);
          AppMethodBeat.o(27508);
          break;
        }
      localObject1 = null;
      Object localObject2 = this.ldh.field_encryptUsername;
      if (!bo.isNullOrNil((String)localObject2))
      {
        aw.ZK();
        localObject1 = c.XN().RB((String)localObject2);
      }
      localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((bv)localObject1).xDa < 0L)
        {
          aw.ZK();
          localObject2 = c.XN().RB(this.ldh.field_username);
        }
      }
      if ((localObject2 != null) && (!bo.isNullOrNil(((bv)localObject2).field_conDescription)))
      {
        this.vik.setText(j.b(getContext(), bo.nullAsNil(((bv)localObject2).field_conDescription), this.vik.getTextSize()));
        AppMethodBeat.o(27508);
        bool = true;
      }
      else
      {
        Log.i("MicroMsg.ProfileDescribeView", "ProfileDescribeView gone");
        setVisibility(8);
        AppMethodBeat.o(27508);
      }
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public int getLayout()
  {
    return 2130970403;
  }

  public final void init()
  {
    AppMethodBeat.i(27507);
    this.vik = ((TextView)findViewById(2131826650));
    this.vil = ((TextView)findViewById(2131826649));
    setClickable(true);
    AppMethodBeat.o(27507);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ProfileDescribeView
 * JD-Core Version:    0.6.2
 */