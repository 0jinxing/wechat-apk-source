package com.facebook.internal;

import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.share.internal.ShareInternalUtility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;

class WebDialog$UploadStagingResourcesTask extends AsyncTask<Void, Void, String[]>
{
  private String action;
  private Exception[] exceptions;
  private Bundle parameters;

  WebDialog$UploadStagingResourcesTask(WebDialog paramWebDialog, String paramString, Bundle paramBundle)
  {
    this.action = paramString;
    this.parameters = paramBundle;
  }

  protected String[] doInBackground(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(96669);
    String[] arrayOfString = this.parameters.getStringArray("media");
    paramArrayOfVoid = new String[arrayOfString.length];
    this.exceptions = new Exception[arrayOfString.length];
    CountDownLatch localCountDownLatch = new CountDownLatch(arrayOfString.length);
    ConcurrentLinkedQueue localConcurrentLinkedQueue = new ConcurrentLinkedQueue();
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    int i = 0;
    while (true)
    {
      try
      {
        if (i >= arrayOfString.length)
          break label217;
        if (!isCancelled())
          break label145;
        paramArrayOfVoid = localConcurrentLinkedQueue.iterator();
        if (!paramArrayOfVoid.hasNext())
          break;
        ((AsyncTask)paramArrayOfVoid.next()).cancel(true);
        continue;
      }
      catch (Exception paramArrayOfVoid)
      {
        paramArrayOfVoid = localConcurrentLinkedQueue.iterator();
        if (!paramArrayOfVoid.hasNext())
          break label229;
      }
      ((AsyncTask)paramArrayOfVoid.next()).cancel(true);
    }
    AppMethodBeat.o(96669);
    paramArrayOfVoid = null;
    while (true)
    {
      return paramArrayOfVoid;
      label145: Uri localUri = Uri.parse(arrayOfString[i]);
      if (Utility.isWebUri(localUri))
      {
        paramArrayOfVoid[i] = localUri.toString();
        localCountDownLatch.countDown();
      }
      while (true)
      {
        i++;
        break;
        WebDialog.UploadStagingResourcesTask.1 local1 = new com/facebook/internal/WebDialog$UploadStagingResourcesTask$1;
        local1.<init>(this, paramArrayOfVoid, i, localCountDownLatch);
        localConcurrentLinkedQueue.add(ShareInternalUtility.newUploadStagingResourceWithImageRequest(localAccessToken, localUri, local1).executeAsync());
      }
      label217: localCountDownLatch.await();
      AppMethodBeat.o(96669);
      continue;
      label229: AppMethodBeat.o(96669);
      paramArrayOfVoid = null;
    }
  }

  protected void onPostExecute(String[] paramArrayOfString)
  {
    AppMethodBeat.i(96670);
    WebDialog.access$300(this.this$0).dismiss();
    Exception[] arrayOfException = this.exceptions;
    int i = arrayOfException.length;
    int j = 0;
    if (j < i)
    {
      Exception localException = arrayOfException[j];
      if (localException != null)
      {
        this.this$0.sendErrorToListener(localException);
        AppMethodBeat.o(96670);
      }
    }
    while (true)
    {
      return;
      j++;
      break;
      if (paramArrayOfString == null)
      {
        this.this$0.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
        AppMethodBeat.o(96670);
      }
      else
      {
        paramArrayOfString = Arrays.asList(paramArrayOfString);
        if (paramArrayOfString.contains(null))
        {
          this.this$0.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
          AppMethodBeat.o(96670);
        }
        else
        {
          Utility.putJSONValueInBundle(this.parameters, "media", new JSONArray(paramArrayOfString));
          paramArrayOfString = Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + this.action, this.parameters);
          WebDialog.access$902(this.this$0, paramArrayOfString.toString());
          j = WebDialog.access$600(this.this$0).getDrawable().getIntrinsicWidth();
          WebDialog.access$1000(this.this$0, j / 2 + 1);
          AppMethodBeat.o(96670);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WebDialog.UploadStagingResourcesTask
 * JD-Core Version:    0.6.2
 */