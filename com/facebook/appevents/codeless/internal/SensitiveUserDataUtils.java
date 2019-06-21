package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SensitiveUserDataUtils
{
  private static boolean isCreditCard(TextView paramTextView)
  {
    boolean bool = false;
    AppMethodBeat.i(72112);
    paramTextView = ViewHierarchy.getTextOfView(paramTextView).replaceAll("\\s", "");
    int i = paramTextView.length();
    if ((i < 12) || (i > 19))
      AppMethodBeat.o(72112);
    while (true)
    {
      return bool;
      int j = 0;
      int k = 0;
      int m = i - 1;
      if (m >= 0)
      {
        i = paramTextView.charAt(m);
        if ((i < 48) || (i > 57))
        {
          AppMethodBeat.o(72112);
        }
        else
        {
          int n = i - 48;
          i = n;
          if (j != 0)
          {
            n *= 2;
            i = n;
            if (n > 9)
              i = n % 10 + 1;
          }
          k += i;
          if (j == 0);
          for (i = 1; ; i = 0)
          {
            m--;
            j = i;
            break;
          }
        }
      }
      else if (k % 10 == 0)
      {
        AppMethodBeat.o(72112);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(72112);
      }
    }
  }

  private static boolean isEmail(TextView paramTextView)
  {
    AppMethodBeat.i(72108);
    boolean bool;
    if (paramTextView.getInputType() == 32)
    {
      bool = true;
      AppMethodBeat.o(72108);
    }
    while (true)
    {
      return bool;
      paramTextView = ViewHierarchy.getTextOfView(paramTextView);
      if ((paramTextView == null) || (paramTextView.length() == 0))
      {
        bool = false;
        AppMethodBeat.o(72108);
      }
      else
      {
        bool = Patterns.EMAIL_ADDRESS.matcher(paramTextView).matches();
        AppMethodBeat.o(72108);
      }
    }
  }

  private static boolean isPassword(TextView paramTextView)
  {
    AppMethodBeat.i(72107);
    boolean bool;
    if (paramTextView.getInputType() == 128)
    {
      bool = true;
      AppMethodBeat.o(72107);
    }
    while (true)
    {
      return bool;
      bool = paramTextView.getTransformationMethod() instanceof PasswordTransformationMethod;
      AppMethodBeat.o(72107);
    }
  }

  private static boolean isPersonName(TextView paramTextView)
  {
    AppMethodBeat.i(72109);
    boolean bool;
    if (paramTextView.getInputType() == 96)
    {
      bool = true;
      AppMethodBeat.o(72109);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72109);
    }
  }

  private static boolean isPhoneNumber(TextView paramTextView)
  {
    AppMethodBeat.i(72111);
    boolean bool;
    if (paramTextView.getInputType() == 3)
    {
      bool = true;
      AppMethodBeat.o(72111);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72111);
    }
  }

  private static boolean isPostalAddress(TextView paramTextView)
  {
    AppMethodBeat.i(72110);
    boolean bool;
    if (paramTextView.getInputType() == 112)
    {
      bool = true;
      AppMethodBeat.o(72110);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72110);
    }
  }

  public static boolean isSensitiveUserData(View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(72106);
    if ((paramView instanceof TextView))
    {
      paramView = (TextView)paramView;
      if ((isPassword(paramView)) || (isCreditCard(paramView)) || (isPersonName(paramView)) || (isPostalAddress(paramView)) || (isPhoneNumber(paramView)) || (isEmail(paramView)))
      {
        bool = true;
        AppMethodBeat.o(72106);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(72106);
      continue;
      AppMethodBeat.o(72106);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.internal.SensitiveUserDataUtils
 * JD-Core Version:    0.6.2
 */