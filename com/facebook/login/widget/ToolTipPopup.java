package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class ToolTipPopup
{
  public static final long DEFAULT_POPUP_DISPLAY_TIME = 6000L;
  private final WeakReference<View> mAnchorViewRef;
  private final Context mContext;
  private long mNuxDisplayTime;
  private ToolTipPopup.PopupContentView mPopupContent;
  private PopupWindow mPopupWindow;
  private final ViewTreeObserver.OnScrollChangedListener mScrollListener;
  private ToolTipPopup.Style mStyle;
  private final String mText;

  public ToolTipPopup(String paramString, View paramView)
  {
    AppMethodBeat.i(92721);
    this.mStyle = ToolTipPopup.Style.BLUE;
    this.mNuxDisplayTime = 6000L;
    this.mScrollListener = new ViewTreeObserver.OnScrollChangedListener()
    {
      public void onScrollChanged()
      {
        AppMethodBeat.i(92711);
        if ((ToolTipPopup.this.mAnchorViewRef.get() != null) && (ToolTipPopup.this.mPopupWindow != null) && (ToolTipPopup.this.mPopupWindow.isShowing()))
          if (ToolTipPopup.this.mPopupWindow.isAboveAnchor())
          {
            ToolTipPopup.this.mPopupContent.showBottomArrow();
            AppMethodBeat.o(92711);
          }
        while (true)
        {
          return;
          ToolTipPopup.this.mPopupContent.showTopArrow();
          AppMethodBeat.o(92711);
        }
      }
    };
    this.mText = paramString;
    this.mAnchorViewRef = new WeakReference(paramView);
    this.mContext = paramView.getContext();
    AppMethodBeat.o(92721);
  }

  private void registerObserver()
  {
    AppMethodBeat.i(92725);
    unregisterObserver();
    if (this.mAnchorViewRef.get() != null)
      ((View)this.mAnchorViewRef.get()).getViewTreeObserver().addOnScrollChangedListener(this.mScrollListener);
    AppMethodBeat.o(92725);
  }

  private void unregisterObserver()
  {
    AppMethodBeat.i(92726);
    if (this.mAnchorViewRef.get() != null)
      ((View)this.mAnchorViewRef.get()).getViewTreeObserver().removeOnScrollChangedListener(this.mScrollListener);
    AppMethodBeat.o(92726);
  }

  private void updateArrows()
  {
    AppMethodBeat.i(92723);
    if ((this.mPopupWindow != null) && (this.mPopupWindow.isShowing()))
      if (this.mPopupWindow.isAboveAnchor())
      {
        this.mPopupContent.showBottomArrow();
        AppMethodBeat.o(92723);
      }
    while (true)
    {
      return;
      this.mPopupContent.showTopArrow();
      AppMethodBeat.o(92723);
    }
  }

  public void dismiss()
  {
    AppMethodBeat.i(92724);
    unregisterObserver();
    if (this.mPopupWindow != null)
      this.mPopupWindow.dismiss();
    AppMethodBeat.o(92724);
  }

  public void setNuxDisplayTime(long paramLong)
  {
    this.mNuxDisplayTime = paramLong;
  }

  public void setStyle(ToolTipPopup.Style paramStyle)
  {
    this.mStyle = paramStyle;
  }

  public void show()
  {
    AppMethodBeat.i(92722);
    if (this.mAnchorViewRef.get() != null)
    {
      this.mPopupContent = new ToolTipPopup.PopupContentView(this, this.mContext);
      ((TextView)this.mPopupContent.findViewById(2131822902)).setText(this.mText);
      if (this.mStyle != ToolTipPopup.Style.BLUE)
        break label263;
      ToolTipPopup.PopupContentView.access$300(this.mPopupContent).setBackgroundResource(2130838391);
      ToolTipPopup.PopupContentView.access$400(this.mPopupContent).setImageResource(2130838392);
      ToolTipPopup.PopupContentView.access$500(this.mPopupContent).setImageResource(2130838393);
      ToolTipPopup.PopupContentView.access$600(this.mPopupContent).setImageResource(2130838394);
    }
    while (true)
    {
      View localView = ((Activity)this.mContext).getWindow().getDecorView();
      int i = localView.getWidth();
      int j = localView.getHeight();
      registerObserver();
      this.mPopupContent.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(j, -2147483648));
      this.mPopupWindow = new PopupWindow(this.mPopupContent, this.mPopupContent.getMeasuredWidth(), this.mPopupContent.getMeasuredHeight());
      this.mPopupWindow.showAsDropDown((View)this.mAnchorViewRef.get());
      updateArrows();
      if (this.mNuxDisplayTime > 0L)
        this.mPopupContent.postDelayed(new ToolTipPopup.2(this), this.mNuxDisplayTime);
      this.mPopupWindow.setTouchable(true);
      this.mPopupContent.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(92713);
          ToolTipPopup.this.dismiss();
          AppMethodBeat.o(92713);
        }
      });
      AppMethodBeat.o(92722);
      return;
      label263: ToolTipPopup.PopupContentView.access$300(this.mPopupContent).setBackgroundResource(2130838387);
      ToolTipPopup.PopupContentView.access$400(this.mPopupContent).setImageResource(2130838388);
      ToolTipPopup.PopupContentView.access$500(this.mPopupContent).setImageResource(2130838389);
      ToolTipPopup.PopupContentView.access$600(this.mPopupContent).setImageResource(2130838390);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.login.widget.ToolTipPopup
 * JD-Core Version:    0.6.2
 */