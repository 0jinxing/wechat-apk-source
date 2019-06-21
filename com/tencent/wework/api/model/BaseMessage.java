package com.tencent.wework.api.model;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.wework.api.util.ReflecterHelper;

public abstract class BaseMessage
{
  protected Context mContext = null;

  public static Bundle b(BaseMessage paramBaseMessage)
  {
    if (paramBaseMessage == null);
    Bundle localBundle;
    for (paramBaseMessage = null; ; paramBaseMessage = localBundle)
    {
      return paramBaseMessage;
      localBundle = new Bundle();
      paramBaseMessage.toBundle(localBundle);
      localBundle.putString("_wwobject_identifier_", paramBaseMessage.getClass().getName());
    }
  }

  public static BaseMessage x(Uri paramUri)
  {
    try
    {
      paramUri = paramUri.getQueryParameter("wwoid");
      if (!TextUtils.isEmpty(paramUri))
      {
        paramUri = (BaseMessage)ReflecterHelper.newInstance(paramUri);
        return paramUri;
      }
    }
    catch (Throwable paramUri)
    {
      while (true)
        paramUri = null;
    }
  }

  public abstract boolean checkArgs();

  public final void setContext(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public abstract void toBundle(Bundle paramBundle);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.model.BaseMessage
 * JD-Core Version:    0.6.2
 */