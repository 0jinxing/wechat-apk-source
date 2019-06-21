package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public class GameDropdownView extends TextView
  implements View.OnClickListener, PopupWindow.OnDismissListener
{
  private Context mContext;
  private b nid;
  private LinkedList<String> nie;
  private int nif;
  private int nig;
  private GameDropdownView.a nih;
  private View nii;
  private View.OnClickListener nij;

  public GameDropdownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(111916);
    this.nif = 0;
    this.nig = 0;
    this.nih = null;
    this.nii = null;
    this.nij = new GameDropdownView.1(this);
    this.mContext = paramContext;
    this.nid = new b(paramContext);
    setOnClickListener(this);
    AppMethodBeat.o(111916);
  }

  private void setCurrentSelection(int paramInt)
  {
    AppMethodBeat.i(111920);
    if ((this.nid.getContentView() == null) || (!(this.nid.getContentView() instanceof ViewGroup)))
      AppMethodBeat.o(111920);
    while (true)
    {
      return;
      ViewGroup localViewGroup = (ViewGroup)this.nid.getContentView();
      if ((paramInt > this.nig) || (this.nif > this.nig) || (!(localViewGroup.getChildAt(paramInt) instanceof TextView)) || (!(localViewGroup.getChildAt(this.nif) instanceof TextView)))
      {
        AppMethodBeat.o(111920);
      }
      else
      {
        ((TextView)localViewGroup.getChildAt(this.nif)).setTextColor(this.mContext.getResources().getColor(2131690164));
        ((TextView)localViewGroup.getChildAt(paramInt)).setTextColor(this.mContext.getResources().getColor(2131690316));
        setText((CharSequence)this.nie.get(paramInt));
        if ((this.nih != null) && (this.nif != paramInt))
          this.nih.wI(paramInt);
        this.nif = paramInt;
        AppMethodBeat.o(111920);
      }
    }
  }

  public final void e(LinkedList<String> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(111919);
    if (paramLinkedList.size() == 0)
    {
      ab.i("MicroMsg.GameDropdownView", "No menu item");
      AppMethodBeat.o(111919);
    }
    while (true)
    {
      return;
      this.nie = paramLinkedList;
      this.nig = (paramLinkedList.size() - 1);
      if ((paramInt < 0) || (paramInt > this.nig));
      LinearLayout localLinearLayout;
      for (this.nif = 0; ; this.nif = paramInt)
      {
        LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
        localLinearLayout = (LinearLayout)localLayoutInflater.inflate(2130969735, null);
        for (paramInt = 0; paramInt < paramLinkedList.size(); paramInt++)
        {
          String str = (String)paramLinkedList.get(paramInt);
          TextView localTextView = (TextView)localLayoutInflater.inflate(2130969736, localLinearLayout, false);
          localTextView.setText(str);
          localTextView.setOnClickListener(this.nij);
          if (paramInt == this.nif)
          {
            localTextView.setTextColor(this.mContext.getResources().getColor(2131690316));
            setText(str);
          }
          localLinearLayout.addView(localTextView);
        }
      }
      this.nid.setContentView(localLinearLayout);
      setVisibility(0);
      AppMethodBeat.o(111919);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111918);
    if (this.nid.isShowing())
    {
      this.nid.dismiss();
      AppMethodBeat.o(111918);
    }
    while (true)
    {
      return;
      if (this.nii == null)
      {
        this.nid.showAsDropDown(this);
        AppMethodBeat.o(111918);
      }
      else
      {
        this.nid.showAsDropDown(this.nii);
        AppMethodBeat.o(111918);
      }
    }
  }

  public void onDismiss()
  {
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111917);
    super.onFinishInflate();
    setVisibility(8);
    AppMethodBeat.o(111917);
  }

  public void setAnchorView(View paramView)
  {
    this.nii = paramView;
  }

  public void setOnSelectionChangedListener(GameDropdownView.a parama)
  {
    this.nih = parama;
  }

  static final class b extends PopupWindow
  {
    public b(Context paramContext)
    {
      super();
      AppMethodBeat.i(111915);
      setWindowLayoutMode(-1, -2);
      setBackgroundDrawable(new BitmapDrawable());
      setFocusable(true);
      setOutsideTouchable(true);
      setTouchInterceptor(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          AppMethodBeat.i(111914);
          boolean bool;
          if (paramAnonymousMotionEvent.getAction() == 4)
          {
            GameDropdownView.b.this.dismiss();
            bool = true;
            AppMethodBeat.o(111914);
          }
          while (true)
          {
            return bool;
            bool = false;
            AppMethodBeat.o(111914);
          }
        }
      });
      setAnimationStyle(2131034186);
      AppMethodBeat.o(111915);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDropdownView
 * JD-Core Version:    0.6.2
 */