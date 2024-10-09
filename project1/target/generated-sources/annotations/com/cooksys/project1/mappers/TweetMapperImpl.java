package com.cooksys.project1.mappers;

import com.cooksys.project1.dtos.TweetRequestDto;
import com.cooksys.project1.dtos.TweetResponseDto;
import com.cooksys.project1.entities.Tweet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-09T15:36:25-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class TweetMapperImpl implements TweetMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public TweetResponseDto entityToDto(Tweet tweet) {
        if ( tweet == null ) {
            return null;
        }

        TweetResponseDto tweetResponseDto = new TweetResponseDto();

        tweetResponseDto.setId( tweet.getId() );
        tweetResponseDto.setAuthor( userMapper.entityToDto( tweet.getAuthor() ) );
        tweetResponseDto.setPosted( tweet.getPosted() );
        tweetResponseDto.setContent( tweet.getContent() );
        tweetResponseDto.setInReplyTo( entityToDto( tweet.getInReplyTo() ) );
        tweetResponseDto.setRepostOf( entityToDto( tweet.getRepostOf() ) );

        return tweetResponseDto;
    }

    @Override
    public Tweet requestDtoToEntity(TweetRequestDto tweetRequestDto) {
        if ( tweetRequestDto == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setContent( tweetRequestDto.getContent() );

        return tweet;
    }

    @Override
    public List<TweetResponseDto> entitiesToDtos(List<Tweet> all) {
        if ( all == null ) {
            return null;
        }

        List<TweetResponseDto> list = new ArrayList<TweetResponseDto>( all.size() );
        for ( Tweet tweet : all ) {
            list.add( entityToDto( tweet ) );
        }

        return list;
    }
}
