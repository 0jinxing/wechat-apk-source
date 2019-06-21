package com.tencent.xweb;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public final class v
{
  private static final Object ANg;

  static
  {
    AppMethodBeat.i(3956);
    ANg = new Object();
    AppMethodBeat.o(3956);
  }

  public static void ab(String[] paramArrayOfString)
  {
    AppMethodBeat.i(3955);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      AppMethodBeat.o(3955);
    while (true)
    {
      return;
      synchronized (ANg)
      {
        Object localObject2 = XWalkEnvironment.getSharedPreferencesForFileReaderRecord();
        if (localObject2 == null)
          Log.e("FileReaderCrashDetect", "resetCrashInfo sp is null");
        SharedPreferences.Editor localEditor = ((SharedPreferences)localObject2).edit();
        if (localEditor == null)
        {
          Log.e("FileReaderCrashDetect", "resetCrashInfo editor is null");
          AppMethodBeat.o(3955);
          continue;
        }
        int i = paramArrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          localObject2 = paramArrayOfString[j];
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localEditor.remove((String)localObject2 + "_count");
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localEditor.remove((String)localObject2 + "_time");
          localEditor.commit();
        }
        AppMethodBeat.o(3955);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.v
 * JD-Core Version:    0.6.2
 */