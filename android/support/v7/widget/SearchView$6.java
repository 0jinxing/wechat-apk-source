package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

final class SearchView$6
  implements View.OnClickListener
{
  SearchView$6(SearchView paramSearchView)
  {
  }

  public final void onClick(View paramView)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramView == this.ary.aqG)
      this.ary.kK();
    SearchView localSearchView;
    SearchableInfo localSearchableInfo;
    label160: label168: 
    do
    {
      do
      {
        while (true)
        {
          return;
          if (paramView == this.ary.aqI)
          {
            this.ary.kJ();
          }
          else
          {
            if (paramView != this.ary.aqH)
              break;
            this.ary.kI();
          }
        }
        if (paramView != this.ary.aqJ)
          break;
        localSearchView = this.ary;
      }
      while (localSearchView.aro == null);
      localSearchableInfo = localSearchView.aro;
      while (true)
      {
        try
        {
          if (!localSearchableInfo.getVoiceSearchLaunchWebSearch())
            break label168;
          paramView = localSearchView.aqU;
          localObject3 = new android/content/Intent;
          ((Intent)localObject3).<init>(paramView);
          paramView = localSearchableInfo.getSearchActivity();
          if (paramView != null)
            break label160;
          paramView = (View)localObject2;
          ((Intent)localObject3).putExtra("calling_package", paramView);
          localSearchView.getContext().startActivity((Intent)localObject3);
        }
        catch (ActivityNotFoundException paramView)
        {
        }
        break;
        paramView = paramView.flattenToShortString();
      }
    }
    while (!localSearchableInfo.getVoiceSearchLaunchRecognizer());
    paramView = localSearchView.aqV;
    ComponentName localComponentName = localSearchableInfo.getSearchActivity();
    localObject2 = new android/content/Intent;
    ((Intent)localObject2).<init>("android.intent.action.SEARCH");
    ((Intent)localObject2).setComponent(localComponentName);
    PendingIntent localPendingIntent = PendingIntent.getActivity(localSearchView.getContext(), 0, (Intent)localObject2, 1073741824);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    if (localSearchView.arp != null)
      localBundle.putParcelable("app_data", localSearchView.arp);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramView);
    int i = 1;
    Object localObject3 = localSearchView.getResources();
    if (localSearchableInfo.getVoiceLanguageModeId() != 0);
    for (paramView = ((Resources)localObject3).getString(localSearchableInfo.getVoiceLanguageModeId()); ; paramView = "free_form")
    {
      if (localSearchableInfo.getVoicePromptTextId() != 0);
      for (localObject2 = ((Resources)localObject3).getString(localSearchableInfo.getVoicePromptTextId()); ; localObject2 = null)
      {
        if (localSearchableInfo.getVoiceLanguageId() != 0);
        for (localObject3 = ((Resources)localObject3).getString(localSearchableInfo.getVoiceLanguageId()); ; localObject3 = null)
        {
          if (localSearchableInfo.getVoiceMaxResults() != 0)
            i = localSearchableInfo.getVoiceMaxResults();
          localIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", paramView);
          localIntent.putExtra("android.speech.extra.PROMPT", (String)localObject2);
          localIntent.putExtra("android.speech.extra.LANGUAGE", (String)localObject3);
          localIntent.putExtra("android.speech.extra.MAX_RESULTS", i);
          if (localComponentName == null);
          for (paramView = localObject1; ; paramView = localComponentName.flattenToShortString())
          {
            localIntent.putExtra("calling_package", paramView);
            localIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", localPendingIntent);
            localIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", localBundle);
            localSearchView.getContext().startActivity(localIntent);
            break;
          }
          if (paramView != this.ary.aqC)
            break;
          this.ary.kM();
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView.6
 * JD-Core Version:    0.6.2
 */