package com.facebook.share.model;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent$Builder<P extends ShareContent, E extends Builder>
  implements ShareModelBuilder<P, E>
{
  private Uri contentUrl;
  private ShareHashtag hashtag;
  private String pageId;
  private List<String> peopleIds;
  private String placeId;
  private String ref;

  public E readFrom(P paramP)
  {
    if (paramP == null);
    for (paramP = this; ; paramP = setContentUrl(paramP.getContentUrl()).setPeopleIds(paramP.getPeopleIds()).setPlaceId(paramP.getPlaceId()).setPageId(paramP.getPageId()).setRef(paramP.getRef()))
      return paramP;
  }

  public E setContentUrl(Uri paramUri)
  {
    this.contentUrl = paramUri;
    return this;
  }

  public E setPageId(String paramString)
  {
    this.pageId = paramString;
    return this;
  }

  public E setPeopleIds(List<String> paramList)
  {
    if (paramList == null);
    for (paramList = null; ; paramList = Collections.unmodifiableList(paramList))
    {
      this.peopleIds = paramList;
      return this;
    }
  }

  public E setPlaceId(String paramString)
  {
    this.placeId = paramString;
    return this;
  }

  public E setRef(String paramString)
  {
    this.ref = paramString;
    return this;
  }

  public E setShareHashtag(ShareHashtag paramShareHashtag)
  {
    this.hashtag = paramShareHashtag;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareContent.Builder
 * JD-Core Version:    0.6.2
 */