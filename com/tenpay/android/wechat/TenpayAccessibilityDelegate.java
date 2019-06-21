package com.tenpay.android.wechat;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tenpay.bankcard.LogUtil;
import java.lang.reflect.Method;

public class TenpayAccessibilityDelegate extends View.AccessibilityDelegate
{
  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }

  public AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
  {
    return null;
  }

  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
  }

  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
  }

  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
  }

  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }

  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return false;
  }

  public void sendAccessibilityEvent(View paramView, int paramInt)
  {
    AppMethodBeat.i(5494);
    LogUtil.d("CFT", new Object[] { "sendAccessibilityEvent eventType=".concat(String.valueOf(paramInt)) });
    Object localObject1;
    if ((paramView != null) && (paramInt == 128))
      if ((paramView instanceof EditText))
      {
        LogUtil.d("CFT", new Object[] { "EditText" });
        localObject1 = (EditText)paramView;
        if (!TextUtils.isEmpty(((EditText)localObject1).getContentDescription()))
          localObject1 = ((EditText)localObject1).getContentDescription();
      }
    while (true)
    {
      Object localObject2 = localObject1;
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        for (paramInt = 0; ; paramInt++)
        {
          localObject2 = localObject1;
          if (paramInt >= ((CharSequence)localObject1).length())
            break;
          TenpayTTSUtil.speak(String.valueOf(((CharSequence)localObject1).charAt(paramInt)));
        }
        if (((EditText)localObject1).getHint() != null)
        {
          localObject1 = ((EditText)localObject1).getHint();
          continue;
          LogUtil.d("CFT", new Object[] { "not EditText" });
          localObject2 = paramView.getContentDescription();
          TenpayTTSUtil.speak((CharSequence)localObject2);
        }
      }
      else
      {
        LogUtil.d("CFT", new Object[] { "content = ".concat(String.valueOf(localObject2)) });
        LogUtil.d("CFT", new Object[] { "host.getContentDescription() = " + paramView.getContentDescription() });
        if (!TextUtils.isEmpty((CharSequence)localObject2));
        while (true)
        {
          try
          {
            localObject1 = View.class.getMethod("clearAccessibilityFocus", null);
            ((Method)localObject1).setAccessible(true);
            ((Method)localObject1).invoke(paramView, null);
            localObject1 = View.class.getMethod("requestAccessibilityFocus", null);
            ((Method)localObject1).setAccessible(true);
            ((Method)localObject1).invoke(paramView, null);
            AppMethodBeat.o(5494);
            return;
          }
          catch (Exception paramView)
          {
          }
          AppMethodBeat.o(5494);
        }
        localObject1 = null;
      }
    }
  }

  public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tenpay.android.wechat.TenpayAccessibilityDelegate
 * JD-Core Version:    0.6.2
 */