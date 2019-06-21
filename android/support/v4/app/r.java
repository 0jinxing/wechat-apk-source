package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class r
{
  public abstract <D> c<D> a(a<D> parama);

  public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);

  public static abstract interface a<D>
  {
    public abstract c<D> onCreateLoader(int paramInt, Bundle paramBundle);

    public abstract void onLoadFinished(c<D> paramc, D paramD);

    public abstract void onLoaderReset(c<D> paramc);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.r
 * JD-Core Version:    0.6.2
 */