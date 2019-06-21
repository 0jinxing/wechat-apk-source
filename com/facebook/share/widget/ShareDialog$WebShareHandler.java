package com.facebook.share.widget;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeAppCallAttachmentStore.Attachment;
import com.facebook.share.Sharer.Result;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhoto.Builder;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.SharePhotoContent.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class ShareDialog$WebShareHandler extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
{
  private ShareDialog$WebShareHandler(ShareDialog paramShareDialog)
  {
    super(paramShareDialog);
  }

  private SharePhotoContent createAndMapAttachments(SharePhotoContent paramSharePhotoContent, UUID paramUUID)
  {
    AppMethodBeat.i(97703);
    SharePhotoContent.Builder localBuilder = new SharePhotoContent.Builder().readFrom(paramSharePhotoContent);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    for (int i = 0; i < paramSharePhotoContent.getPhotos().size(); i++)
    {
      SharePhoto localSharePhoto1 = (SharePhoto)paramSharePhotoContent.getPhotos().get(i);
      Object localObject = localSharePhoto1.getBitmap();
      SharePhoto localSharePhoto2 = localSharePhoto1;
      if (localObject != null)
      {
        localObject = NativeAppCallAttachmentStore.createAttachment(paramUUID, (Bitmap)localObject);
        localSharePhoto2 = new SharePhoto.Builder().readFrom(localSharePhoto1).setImageUrl(Uri.parse(((NativeAppCallAttachmentStore.Attachment)localObject).getAttachmentUrl())).setBitmap(null).build();
        localArrayList2.add(localObject);
      }
      localArrayList1.add(localSharePhoto2);
    }
    localBuilder.setPhotos(localArrayList1);
    NativeAppCallAttachmentStore.addAttachments(localArrayList2);
    paramSharePhotoContent = localBuilder.build();
    AppMethodBeat.o(97703);
    return paramSharePhotoContent;
  }

  private String getActionName(ShareContent paramShareContent)
  {
    if (((paramShareContent instanceof ShareLinkContent)) || ((paramShareContent instanceof SharePhotoContent)))
      paramShareContent = "share";
    while (true)
    {
      return paramShareContent;
      if ((paramShareContent instanceof ShareOpenGraphContent))
        paramShareContent = "share_open_graph";
      else
        paramShareContent = null;
    }
  }

  public boolean canShow(ShareContent paramShareContent, boolean paramBoolean)
  {
    AppMethodBeat.i(97701);
    if ((paramShareContent != null) && (ShareDialog.access$900(paramShareContent)))
    {
      paramBoolean = true;
      AppMethodBeat.o(97701);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(97701);
    }
  }

  public AppCall createAppCall(ShareContent paramShareContent)
  {
    AppMethodBeat.i(97702);
    ShareDialog.access$700(this.this$0, ShareDialog.access$1000(this.this$0), paramShareContent, ShareDialog.Mode.WEB);
    AppCall localAppCall = this.this$0.createBaseAppCall();
    ShareContentValidation.validateForWebShare(paramShareContent);
    Bundle localBundle;
    if ((paramShareContent instanceof ShareLinkContent))
      localBundle = WebDialogParameters.create((ShareLinkContent)paramShareContent);
    while (true)
    {
      DialogPresenter.setupAppCallForWebDialog(localAppCall, getActionName(paramShareContent), localBundle);
      AppMethodBeat.o(97702);
      return localAppCall;
      if ((paramShareContent instanceof SharePhotoContent))
        localBundle = WebDialogParameters.create(createAndMapAttachments((SharePhotoContent)paramShareContent, localAppCall.getCallId()));
      else
        localBundle = WebDialogParameters.create((ShareOpenGraphContent)paramShareContent);
    }
  }

  public Object getMode()
  {
    return ShareDialog.Mode.WEB;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.share.widget.ShareDialog.WebShareHandler
 * JD-Core Version:    0.6.2
 */