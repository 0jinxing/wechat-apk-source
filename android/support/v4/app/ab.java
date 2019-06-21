package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

public final class ab
{
  public static final class a
  {
    public ArrayList<String> FZ;
    public ArrayList<String> Ga;
    public ArrayList<String> Gb;
    public ArrayList<Uri> Gc;
    private Activity mActivity;
    public Intent mIntent;

    public a(Activity paramActivity)
    {
      this.mActivity = paramActivity;
      this.mIntent = new Intent().setAction("android.intent.action.SEND");
      this.mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", paramActivity.getPackageName());
      this.mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", paramActivity.getComponentName());
      this.mIntent.addFlags(524288);
    }

    public final void a(String paramString, ArrayList<String> paramArrayList)
    {
      String[] arrayOfString1 = this.mIntent.getStringArrayExtra(paramString);
      if (arrayOfString1 != null);
      for (int i = arrayOfString1.length; ; i = 0)
      {
        String[] arrayOfString2 = new String[paramArrayList.size() + i];
        paramArrayList.toArray(arrayOfString2);
        if (arrayOfString1 != null)
          System.arraycopy(arrayOfString1, 0, arrayOfString2, paramArrayList.size(), i);
        this.mIntent.putExtra(paramString, arrayOfString2);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ab
 * JD-Core Version:    0.6.2
 */