package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public final class aa
{
  final String FU;
  final CharSequence FV;
  final CharSequence[] FW;
  final boolean FX;
  final Set<String> FY;
  final Bundle mExtras;

  public aa(String paramString, CharSequence paramCharSequence, CharSequence[] paramArrayOfCharSequence, boolean paramBoolean, Bundle paramBundle, Set<String> paramSet)
  {
    this.FU = paramString;
    this.FV = paramCharSequence;
    this.FW = paramArrayOfCharSequence;
    this.FX = paramBoolean;
    this.mExtras = paramBundle;
    this.FY = paramSet;
  }

  static RemoteInput[] b(aa[] paramArrayOfaa)
  {
    if (paramArrayOfaa == null);
    RemoteInput[] arrayOfRemoteInput;
    for (paramArrayOfaa = null; ; paramArrayOfaa = arrayOfRemoteInput)
    {
      return paramArrayOfaa;
      arrayOfRemoteInput = new RemoteInput[paramArrayOfaa.length];
      for (int i = 0; i < paramArrayOfaa.length; i++)
      {
        aa localaa = paramArrayOfaa[i];
        arrayOfRemoteInput[i] = new RemoteInput.Builder(localaa.FU).setLabel(localaa.FV).setChoices(localaa.FW).setAllowFreeFormInput(localaa.FX).addExtras(localaa.mExtras).build();
      }
    }
  }

  public static final class a
  {
    public final String FU;
    public CharSequence FV;
    public CharSequence[] FW;
    public boolean FX = true;
    public final Set<String> FY = new HashSet();
    public Bundle mExtras = new Bundle();

    public a(String paramString)
    {
      this.FU = paramString;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.aa
 * JD-Core Version:    0.6.2
 */