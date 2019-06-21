package com.tencent.mm.ui.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.Settings.Secure;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Method;
import java.util.Locale;

@TargetApi(14)
public final class c extends View.AccessibilityDelegate
{
  private boolean yra;

  public c()
  {
    AppMethodBeat.i(106143);
    this.yra = false;
    a locala = a.a.dzk();
    AudioManager localAudioManager = (AudioManager)locala.Gn.getSystemService("audio");
    if ((locala.dzj()) && ((Settings.Secure.getInt(locala.Gn.getContentResolver(), "speak_password", 0) != 0) || (localAudioManager.isWiredHeadsetOn())));
    for (boolean bool = true; ; bool = false)
    {
      this.yra = bool;
      AppMethodBeat.o(106143);
      return;
    }
  }

  public final boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }

  public final AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
  {
    return null;
  }

  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
  }

  public final void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
  }

  public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return true;
  }

  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return true;
  }

  public final void sendAccessibilityEvent(View paramView, int paramInt)
  {
    AppMethodBeat.i(106144);
    if (!this.yra)
    {
      AppMethodBeat.o(106144);
      return;
    }
    Object localObject;
    if ((paramView != null) && ((paramInt == 128) || (paramInt == 1)))
      if ((paramView instanceof EditText))
      {
        localObject = (EditText)paramView;
        if (!bo.ac(((EditText)localObject).getText()))
          localObject = ((EditText)localObject).getText();
      }
    while (true)
    {
      while (true)
      {
        ab.d("MicroMsg.MMSecureAccessibilityDelegate", "speak content: %s", new Object[] { localObject });
        if (bo.ac((CharSequence)localObject))
        {
          AppMethodBeat.o(106144);
          break;
          if (!bo.ac(((EditText)localObject).getContentDescription()))
          {
            localObject = ((EditText)localObject).getContentDescription();
            continue;
          }
          if (((EditText)localObject).getHint() == null)
            break label385;
          localObject = ((EditText)localObject).getHint();
          continue;
          if ((paramView instanceof TextView))
          {
            if (bo.ac(paramView.getContentDescription()))
            {
              localObject = ((TextView)paramView).getText();
              continue;
            }
            localObject = paramView.getContentDescription();
            continue;
          }
          localObject = paramView.getContentDescription();
          continue;
        }
        a locala = a.a.dzk();
        String str = ((CharSequence)localObject).toString();
        if (locala.yqU == null)
          locala.yqU = new TextToSpeech(locala.Gn, new a.1(locala, str));
        try
        {
          localObject = View.class.getMethod("clearAccessibilityFocus", new Class[0]);
          ((Method)localObject).setAccessible(true);
          ((Method)localObject).invoke(paramView, new Object[0]);
          localObject = View.class.getMethod("requestAccessibilityFocus", new Class[0]);
          ((Method)localObject).setAccessible(true);
          ((Method)localObject).invoke(paramView, new Object[0]);
          if (locala.kgA != null)
            locala.kgA = ((Vibrator)ah.getContext().getSystemService("vibrator"));
          if (locala.kgA != null)
            locala.kgA.vibrate(50L);
          AppMethodBeat.o(106144);
          break;
          TextToSpeech localTextToSpeech = locala.yqU;
          if (aa.don());
          for (localObject = Locale.CHINESE; ; localObject = Locale.ENGLISH)
          {
            localTextToSpeech.setLanguage((Locale)localObject);
            locala.yqU.speak(str, 0, null);
            break;
          }
        }
        catch (Exception paramView)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.Accessibility.AccessibilityHelper", paramView, "", new Object[0]);
        }
      }
      label385: localObject = null;
    }
  }

  public final void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.a.c
 * JD-Core Version:    0.6.2
 */