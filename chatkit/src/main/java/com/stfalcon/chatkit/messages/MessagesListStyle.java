/*******************************************************************************
 * Copyright 2016 stfalcon.com
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.stfalcon.chatkit.messages;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.core.graphics.drawable.DrawableCompat;

import com.stfalcon.chatkit.R;
import com.stfalcon.chatkit.commons.Style;

/**
 * Style for MessagesListStyle customization by xml attributes
 */
@SuppressWarnings("WeakerAccess")
class MessagesListStyle extends Style {

    private int textAutoLinkMask;
    private int incomingTextLinkColor;
    private int outgoingTextLinkColor;

    private int incomingAvatarWidth;
    private int incomingAvatarHeight;

    private int incomingBubbleDrawable;
    private int incomingDefaultBubbleColor;
    private int incomingDefaultBubblePressedColor;
    private int incomingDefaultBubbleSelectedColor;

    private int incomingImageOverlayDrawable;
    private int incomingDefaultImageOverlayPressedColor;
    private int incomingDefaultImageOverlaySelectedColor;

    private int incomingDefaultBubblePaddingLeft;
    private int incomingDefaultBubblePaddingRight;
    private int incomingDefaultBubblePaddingTop;
    private int incomingDefaultBubblePaddingBottom;

    private int incomingTextColor;
    private int incomingTextSize;
    private int incomingTextStyle;

    private int incomingTimeTextColor;
    private int incomingTimeTextSize;
    private int incomingTimeTextStyle;

    private int incomingImageTimeTextColor;
    private int incomingImageTimeTextSize;
    private int incomingImageTimeTextStyle;

    private int outgoingBubbleDrawable;
    private int outgoingDefaultBubbleColor;
    private int outgoingDefaultBubblePressedColor;
    private int outgoingDefaultBubbleSelectedColor;

    private int outgoingImageOverlayDrawable;
    private int outgoingDefaultImageOverlayPressedColor;
    private int outgoingDefaultImageOverlaySelectedColor;

    private int outgoingDefaultBubblePaddingLeft;
    private int outgoingDefaultBubblePaddingRight;
    private int outgoingDefaultBubblePaddingTop;
    private int outgoingDefaultBubblePaddingBottom;

    private int outgoingTextColor;
    private int outgoingTextSize;
    private int outgoingTextStyle;

    private int outgoingTimeTextColor;
    private int outgoingTimeTextSize;
    private int outgoingTimeTextStyle;

    private int outgoingImageTimeTextColor;
    private int outgoingImageTimeTextSize;
    private int outgoingImageTimeTextStyle;

    private int dateHeaderPadding;
    private String dateHeaderFormat;
    private int dateHeaderTextColor;
    private int dateHeaderTextSize;
    private int dateHeaderTextStyle;

    static MessagesListStyle parse(Context context, AttributeSet attrs) {
        MessagesListStyle style = new MessagesListStyle(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MessagesList);

        style.textAutoLinkMask = typedArray.getInt(R.styleable.MessagesList_textAutoLink, 0);
        style.incomingTextLinkColor = typedArray.getColor(R.styleable.MessagesList_incomingTextLinkColor,
                style.getSystemAccentColor());
        style.outgoingTextLinkColor = typedArray.getColor(R.styleable.MessagesList_outgoingTextLinkColor,
                style.getSystemAccentColor());

        style.incomingAvatarWidth = typedArray.getDimensionPixelSize(R.styleable.MessagesList_incomingAvatarWidth,
                style.getDimension(R.dimen.message_avatar_width));
        style.incomingAvatarHeight = typedArray.getDimensionPixelSize(R.styleable.MessagesList_incomingAvatarHeight,
                style.getDimension(R.dimen.message_avatar_height));

        style.incomingBubbleDrawable = typedArray.getResourceId(R.styleable.MessagesList_incomingBubbleDrawable, -1);
        style.incomingDefaultBubbleColor = typedArray.getColor(R.styleable.MessagesList_incomingDefaultBubbleColor,
                style.getColor(R.color.white_two));
        style.incomingDefaultBubblePressedColor = typedArray.getColor(R.styleable.MessagesList_incomingDefaultBubblePressedColor,
                style.getColor(R.color.white_two));
        style.incomingDefaultBubbleSelectedColor = typedArray.getColor(R.styleable.MessagesList_incomingDefaultBubbleSelectedColor,
                style.getColor(R.color.cornflower_blue_two_24));

        style.incomingImageOverlayDrawable = typedArray.getResourceId(R.styleable.MessagesList_incomingImageOverlayDrawable, -1);
        style.incomingDefaultImageOverlayPressedColor = typedArray.getColor(R.styleable.MessagesList_incomingDefaultImageOverlayPressedColor,
                style.getColor(R.color.transparent));
        style.incomingDefaultImageOverlaySelectedColor = typedArray.getColor(R.styleable.MessagesList_incomingDefaultImageOverlaySelectedColor,
                style.getColor(R.color.cornflower_blue_light_40));

        style.incomingDefaultBubblePaddingLeft = typedArray.getDimensionPixelSize(R.styleable.MessagesList_incomingBubblePaddingLeft,
                style.getDimension(R.dimen.message_padding_left));
        style.incomingDefaultBubblePaddingRight = typedArray.getDimensionPixelSize(R.styleable.MessagesList_incomingBubblePaddingRight,
                style.getDimension(R.dimen.message_padding_right));
        style.incomingDefaultBubblePaddingTop = typedArray.getDimensionPixelSize(R.styleable.MessagesList_incomingBubblePaddingTop,
                style.getDimension(R.dimen.message_padding_top));
        style.incomingDefaultBubblePaddingBottom = typedArray.getDimensionPixelSize(R.styleable.MessagesList_incomingBubblePaddingBottom,
                style.getDimension(R.dimen.message_padding_bottom));
        style.incomingTextColor = typedArray.getColor(R.styleable.MessagesList_incomingTextColor,
                style.getColor(R.color.dark_grey_two));
        style.incomingTextSize = typedArray.getDimensionPixelSize(R.styleable.MessagesList_incomingTextSize,
                style.getDimension(R.dimen.message_text_size));
        style.incomingTextStyle = typedArray.getInt(R.styleable.MessagesList_incomingTextStyle, Typeface.NORMAL);

        style.incomingTimeTextColor = typedArray.getColor(R.styleable.MessagesList_incomingTimeTextColor,
                style.getColor(R.color.warm_grey_four));
        style.incomingTimeTextSize = typedArray.getDimensionPixelSize(R.styleable.MessagesList_incomingTimeTextSize,
                style.getDimension(R.dimen.message_time_text_size));
        style.incomingTimeTextStyle = typedArray.getInt(R.styleable.MessagesList_incomingTimeTextStyle, Typeface.NORMAL);

        style.incomingImageTimeTextColor = typedArray.getColor(R.styleable.MessagesList_incomingImageTimeTextColor,
                style.getColor(R.color.warm_grey_four));
        style.incomingImageTimeTextSize = typedArray.getDimensionPixelSize(R.styleable.MessagesList_incomingImageTimeTextSize,
                style.getDimension(R.dimen.message_time_text_size));
        style.incomingImageTimeTextStyle = typedArray.getInt(R.styleable.MessagesList_incomingImageTimeTextStyle, Typeface.NORMAL);

        style.outgoingBubbleDrawable = typedArray.getResourceId(R.styleable.MessagesList_outgoingBubbleDrawable, -1);
        style.outgoingDefaultBubbleColor = typedArray.getColor(R.styleable.MessagesList_outgoingDefaultBubbleColor,
                style.getColor(R.color.cornflower_blue_two));
        style.outgoingDefaultBubblePressedColor = typedArray.getColor(R.styleable.MessagesList_outgoingDefaultBubblePressedColor,
                style.getColor(R.color.cornflower_blue_two));
        style.outgoingDefaultBubbleSelectedColor = typedArray.getColor(R.styleable.MessagesList_outgoingDefaultBubbleSelectedColor,
                style.getColor(R.color.cornflower_blue_two_24));

        style.outgoingImageOverlayDrawable = typedArray.getResourceId(R.styleable.MessagesList_outgoingImageOverlayDrawable, -1);
        style.outgoingDefaultImageOverlayPressedColor = typedArray.getColor(R.styleable.MessagesList_outgoingDefaultImageOverlayPressedColor,
                style.getColor(R.color.transparent));
        style.outgoingDefaultImageOverlaySelectedColor = typedArray.getColor(R.styleable.MessagesList_outgoingDefaultImageOverlaySelectedColor,
                style.getColor(R.color.cornflower_blue_light_40));

        style.outgoingDefaultBubblePaddingLeft = typedArray.getDimensionPixelSize(R.styleable.MessagesList_outgoingBubblePaddingLeft,
                style.getDimension(R.dimen.message_padding_left));
        style.outgoingDefaultBubblePaddingRight = typedArray.getDimensionPixelSize(R.styleable.MessagesList_outgoingBubblePaddingRight,
                style.getDimension(R.dimen.message_padding_right));
        style.outgoingDefaultBubblePaddingTop = typedArray.getDimensionPixelSize(R.styleable.MessagesList_outgoingBubblePaddingTop,
                style.getDimension(R.dimen.message_padding_top));
        style.outgoingDefaultBubblePaddingBottom = typedArray.getDimensionPixelSize(R.styleable.MessagesList_outgoingBubblePaddingBottom,
                style.getDimension(R.dimen.message_padding_bottom));
        style.outgoingTextColor = typedArray.getColor(R.styleable.MessagesList_outgoingTextColor,
                style.getColor(R.color.white));
        style.outgoingTextSize = typedArray.getDimensionPixelSize(R.styleable.MessagesList_outgoingTextSize,
                style.getDimension(R.dimen.message_text_size));
        style.outgoingTextStyle = typedArray.getInt(R.styleable.MessagesList_outgoingTextStyle, Typeface.NORMAL);

        style.outgoingTimeTextColor = typedArray.getColor(R.styleable.MessagesList_outgoingTimeTextColor,
                style.getColor(R.color.white60));
        style.outgoingTimeTextSize = typedArray.getDimensionPixelSize(R.styleable.MessagesList_outgoingTimeTextSize,
                style.getDimension(R.dimen.message_time_text_size));
        style.outgoingTimeTextStyle = typedArray.getInt(R.styleable.MessagesList_outgoingTimeTextStyle, Typeface.NORMAL);

        style.outgoingImageTimeTextColor = typedArray.getColor(R.styleable.MessagesList_outgoingImageTimeTextColor,
                style.getColor(R.color.warm_grey_four));
        style.outgoingImageTimeTextSize = typedArray.getDimensionPixelSize(R.styleable.MessagesList_outgoingImageTimeTextSize,
                style.getDimension(R.dimen.message_time_text_size));
        style.outgoingImageTimeTextStyle = typedArray.getInt(R.styleable.MessagesList_outgoingImageTimeTextStyle, Typeface.NORMAL);

        style.dateHeaderPadding = typedArray.getDimensionPixelSize(R.styleable.MessagesList_dateHeaderPadding,
                style.getDimension(R.dimen.message_date_header_padding));
        style.dateHeaderFormat = typedArray.getString(R.styleable.MessagesList_dateHeaderFormat);
        style.dateHeaderTextColor = typedArray.getColor(R.styleable.MessagesList_dateHeaderTextColor,
                style.getColor(R.color.warm_grey_two));
        style.dateHeaderTextSize = typedArray.getDimensionPixelSize(R.styleable.MessagesList_dateHeaderTextSize,
                style.getDimension(R.dimen.message_date_header_text_size));
        style.dateHeaderTextStyle = typedArray.getInt(R.styleable.MessagesList_dateHeaderTextStyle, Typeface.NORMAL);

        typedArray.recycle();

        return style;
    }

    private MessagesListStyle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private Drawable getMessageSelector(@ColorInt int normalColor, @ColorInt int selectedColor,
                                        @ColorInt int pressedColor, @DrawableRes int shape) {

        Drawable drawable = DrawableCompat.wrap(getVectorDrawable(shape)).mutate();
        DrawableCompat.setTintList(
                drawable,
                new ColorStateList(
                        new int[][]{
                                new int[]{android.R.attr.state_selected},
                                new int[]{android.R.attr.state_pressed},
                                new int[]{-android.R.attr.state_pressed, -android.R.attr.state_selected}
                        },
                        new int[]{selectedColor, pressedColor, normalColor}
                ));
        return drawable;
    }

    protected int getTextAutoLinkMask() {
        return textAutoLinkMask;
    }

    protected int getIncomingTextLinkColor() {
        return incomingTextLinkColor;
    }

    protected int getOutgoingTextLinkColor() {
        return outgoingTextLinkColor;
    }

    protected int getIncomingAvatarWidth() {
        return incomingAvatarWidth;
    }

    protected int getIncomingAvatarHeight() {
        return incomingAvatarHeight;
    }

    protected int getIncomingDefaultBubblePaddingLeft() {
        return incomingDefaultBubblePaddingLeft;
    }

    protected int getIncomingDefaultBubblePaddingRight() {
        return incomingDefaultBubblePaddingRight;
    }

    protected int getIncomingDefaultBubblePaddingTop() {
        return incomingDefaultBubblePaddingTop;
    }

    protected int getIncomingDefaultBubblePaddingBottom() {
        return incomingDefaultBubblePaddingBottom;
    }

    protected int getIncomingTextColor() {
        return incomingTextColor;
    }

    protected int getIncomingTextSize() {
        return incomingTextSize;
    }

    protected int getIncomingTextStyle() {
        return incomingTextStyle;
    }

    protected Drawable getOutgoingBubbleDrawable() {
        if (outgoingBubbleDrawable == -1) {
            return getMessageSelector(outgoingDefaultBubbleColor, outgoingDefaultBubbleSelectedColor,
                    outgoingDefaultBubblePressedColor, R.drawable.shape_outgoing_message);
        } else {
            return getDrawable(outgoingBubbleDrawable);
        }
    }

    protected Drawable getOutgoingImageOverlayDrawable() {
        if (outgoingImageOverlayDrawable == -1) {
            return getMessageSelector(Color.TRANSPARENT, outgoingDefaultImageOverlaySelectedColor,
                    outgoingDefaultImageOverlayPressedColor, R.drawable.shape_outgoing_message);
        } else {
            return getDrawable(outgoingImageOverlayDrawable);
        }
    }

    protected int getOutgoingDefaultBubblePaddingLeft() {
        return outgoingDefaultBubblePaddingLeft;
    }

    protected int getOutgoingDefaultBubblePaddingRight() {
        return outgoingDefaultBubblePaddingRight;
    }

    protected int getOutgoingDefaultBubblePaddingTop() {
        return outgoingDefaultBubblePaddingTop;
    }

    protected int getOutgoingDefaultBubblePaddingBottom() {
        return outgoingDefaultBubblePaddingBottom;
    }

    protected int getOutgoingTextColor() {
        return outgoingTextColor;
    }

    protected int getOutgoingTextSize() {
        return outgoingTextSize;
    }

    protected int getOutgoingTextStyle() {
        return outgoingTextStyle;
    }

    protected int getOutgoingTimeTextColor() {
        return outgoingTimeTextColor;
    }

    protected int getOutgoingTimeTextSize() {
        return outgoingTimeTextSize;
    }

    protected int getOutgoingTimeTextStyle() {
        return outgoingTimeTextStyle;
    }

    protected int getOutgoingImageTimeTextColor() {
        return outgoingImageTimeTextColor;
    }

    protected int getOutgoingImageTimeTextSize() {
        return outgoingImageTimeTextSize;
    }

    protected int getOutgoingImageTimeTextStyle() {
        return outgoingImageTimeTextStyle;
    }

    protected int getDateHeaderTextColor() {
        return dateHeaderTextColor;
    }

    protected int getDateHeaderTextSize() {
        return dateHeaderTextSize;
    }

    protected int getDateHeaderTextStyle() {
        return dateHeaderTextStyle;
    }

    protected int getDateHeaderPadding() {
        return dateHeaderPadding;
    }

    protected String getDateHeaderFormat() {
        return dateHeaderFormat;
    }

    protected int getIncomingTimeTextSize() {
        return incomingTimeTextSize;
    }

    protected int getIncomingTimeTextStyle() {
        return incomingTimeTextStyle;
    }

    protected int getIncomingTimeTextColor() {
        return incomingTimeTextColor;
    }

    protected int getIncomingImageTimeTextColor() {
        return incomingImageTimeTextColor;
    }

    protected int getIncomingImageTimeTextSize() {
        return incomingImageTimeTextSize;
    }

    protected int getIncomingImageTimeTextStyle() {
        return incomingImageTimeTextStyle;
    }

    protected Drawable getIncomingBubbleDrawable() {
        if (incomingBubbleDrawable == -1) {
            return getMessageSelector(incomingDefaultBubbleColor, incomingDefaultBubbleSelectedColor,
                    incomingDefaultBubblePressedColor, R.drawable.shape_incoming_message);
        } else {
            return getDrawable(incomingBubbleDrawable);
        }
    }

    protected Drawable getIncomingImageOverlayDrawable() {
        if (incomingImageOverlayDrawable == -1) {
            return getMessageSelector(Color.TRANSPARENT, incomingDefaultImageOverlaySelectedColor,
                    incomingDefaultImageOverlayPressedColor, R.drawable.shape_incoming_message);
        } else {
            return getDrawable(incomingImageOverlayDrawable);
        }
    }
}
